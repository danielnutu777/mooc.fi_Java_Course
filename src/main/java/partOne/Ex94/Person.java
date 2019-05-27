public class Person {
    private String name;
    private String phoneNumber;

    public Person(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return phoneNumber;
    }

    public void changeNumber(String newNumber){
        this.phoneNumber = newNumber;
    }

    @Override
    public String toString() {
        return name + " number: " + phoneNumber;
    }
}
