import java.util.*;

public class PhoneSearch {
    private Map<String, Set<String>> phoneNumbers;
    private Map<String, Address> addresses;


    public PhoneSearch() {
        this.phoneNumbers = new HashMap<String, Set<String>>();
        this.addresses = new HashMap<String, Address>();
    }

    public void addNumber(String name, String number) {
        if (!phoneNumbers.containsKey(name)) {
            phoneNumbers.put(name, new HashSet<String>());
            phoneNumbers.get(name).add(number);
        } else {
            phoneNumbers.get(name).add(number);
        }
    }

    public void searchNumberByPerson(String name) {
        if (phoneNumbers.containsKey(name)) {
            for (String s : phoneNumbers.keySet()) {
                if (s.equals(name)) {
                    for (String s1 : phoneNumbers.get(s)) {
                        System.out.println(" " + s1);
                        System.out.print("    ");
                    }
                }
            }
        } else {
            System.out.println("  not found");
        }
    }

    public void searchPersonByNumber(String number) {
        boolean b = false;
        for (String s : phoneNumbers.keySet()) {
            if (phoneNumbers.get(s).contains(number)) {
                System.out.println(" " + s);
                b = true;
            }
        }
        if (!b) {
            System.out.println("  not found");
        }
    }

    public void addAddress(String name, String street, String city) {
        if (!addresses.containsKey(name)) {
            addresses.put(name, new Address(street, city));
        }
    }

    public void searchForAddressAndPhoneNumber(String name) {
        if (!addresses.containsKey(name) && !phoneNumbers.containsKey(name)) {
            System.out.println("  not found");
            return;
        }
        if (addresses.containsKey(name)) {
            System.out.print("  address: ");
            for (String s : addresses.keySet()) {
                if (s.equals(name)) {
                    System.out.println(addresses.get(name));
                }
            }
        } else {
            System.out.println("  address unknown");
        }

        if (phoneNumbers.containsKey(name)) {
            System.out.println("  phone numbers: ");
            for (String s : phoneNumbers.keySet()) {
                if (s.equals(name)) {
                    System.out.print("    ");
                    searchNumberByPerson(name);
                    System.out.println(" ");
                }
            }
        } else {
            System.out.println("  phone number not found");
        }
    }

    public void delete(String name) {
        phoneNumbers.remove(name);
        addresses.remove(name);
    }

    public void filter(String keyword) {
        List<String> sortedPhoneNumbers = new ArrayList<String>(phoneNumbers.keySet());
        Collections.sort(sortedPhoneNumbers);

        boolean b = false;
        for (String s : sortedPhoneNumbers) {
            if (s.contains(keyword)) {
                b = true;
            }
        }
        for (Address a : addresses.values()) {
            if (a.getStreet().contains(keyword) || a.getCity().contains(keyword)) {
                b = true;
            }
        }

        if (!keyword.isEmpty() && b == true) {
            for (String s : sortedPhoneNumbers) {
                if (s.contains(keyword)) {
                    System.out.println(" " + s);
                    searchForAddressAndPhoneNumber(s);
                }
            }
            for (Address a : addresses.values()) {
                if (a.getStreet().contains(keyword) || a.getCity().contains(keyword)) {
                    for (String s : addresses.keySet()) {
                        if (addresses.get(s) == a) {
                            System.out.println(" " + s);
                            searchForAddressAndPhoneNumber(s);
                        }
                    }

                }
            }
        } else if (keyword.isEmpty()) {
            for (String s : sortedPhoneNumbers) {
                System.out.println(" " + s);
                searchForAddressAndPhoneNumber(s);
            }
        } else {
            System.out.println(" keyword not found");
        }
    }
}
