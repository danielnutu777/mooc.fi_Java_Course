import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        UserInterface userInterface = new UserInterface();
        Scanner scanner = new Scanner(System.in);
        PhoneSearch phoneSearch = new PhoneSearch();

        userInterface.printMenu();
        while(true){
            System.out.print("command: ");
            String command = scanner.nextLine();

            if(command.equals("1")){
                userInterface.firstCommand(scanner, phoneSearch);
            } else if(command.equals("2")){
                userInterface.secondCommand(scanner, phoneSearch);
            } else if(command.equals("3")){
                userInterface.thirdCommand(scanner, phoneSearch);
            } else if(command.equals("4")){
                userInterface.fourthCommand(scanner, phoneSearch);
            } else if(command.equals("5")){
                userInterface.fifthCommand(scanner, phoneSearch);
            } else if(command.equals("6")){
                userInterface.sixthCommand(scanner, phoneSearch);
            } else if(command.equals("7")){
                userInterface.seventhCommand(scanner, phoneSearch);
            } else{
                break;
            }
        }
    }
}
