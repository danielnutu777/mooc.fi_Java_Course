import java.util.Scanner;

public class UserInterface {

    Scanner scanner = new Scanner(System.in);

    public void printMenu(){
        System.out.println("phone search\n" +
                "available operations:\n" +
                " 1 add a number\n" +
                " 2 search for a number\n" +
                " 3 search for a person by phone number\n" +
                " 4 add an address\n" +
                " 5 search for personal information\n" +
                " 6 delete personal information\n" +
                " 7 filtered listing\n" +
                " x quit" +
                "");
    }

    public void firstCommand(Scanner scanner, PhoneSearch phoneSearch){
        System.out.print("whose number: ");
        String name = scanner.nextLine();
        System.out.print("number: ");
        String number = scanner.nextLine();

        phoneSearch.addNumber(name, number);

    }

    public void secondCommand(Scanner scanner, PhoneSearch phoneSearch){
        System.out.print("whose number: ");
        String name = scanner.nextLine();
        phoneSearch.searchNumberByPerson(name);
    }

    public void thirdCommand(Scanner scanner, PhoneSearch phoneSearch){
        System.out.print("number: ");
        String number = scanner.nextLine();
        phoneSearch.searchPersonByNumber(number);
    }

    public void fourthCommand(Scanner scanner, PhoneSearch phoneSearch){
        System.out.print("whose address: ");
        String name = scanner.nextLine();
        System.out.print("street: ");
        String street = scanner.nextLine();
        System.out.print("city: ");
        String city = scanner.nextLine();

        phoneSearch.addAddress(name, street, city);
    }

    public void fifthCommand(Scanner scanner, PhoneSearch phoneSearch){
        System.out.print("whose information: ");
        String name = scanner.nextLine();
        phoneSearch.searchForAddressAndPhoneNumber(name);
    }

    public void sixthCommand(Scanner scanner, PhoneSearch phoneSearch){
        System.out.print("whose information: ");
        String name = scanner.nextLine();
        phoneSearch.delete(name);
    }

    public void seventhCommand(Scanner scanner, PhoneSearch phoneSearch){
        System.out.print("keyword (if empty, all listed): ");
        String keyword = scanner.nextLine();
        phoneSearch.filter(keyword);
    }
}
