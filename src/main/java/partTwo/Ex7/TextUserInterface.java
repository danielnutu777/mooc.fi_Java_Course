import java.util.Scanner;

public class TextUserInterface {
    private Scanner scanner;
    private Dictionary dictionary;

    public TextUserInterface(Scanner scanner, Dictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start(){
        while(true){
            System.out.print("Statement: ");
            String command = scanner.nextLine();

            if(command.equals("quit")){
                System.out.println("Cheers!");
                break;
            }else if(command.equals("add")){
                add();
            }else if(command.equals("translate")){
                translate();
            }else{
                System.out.println("Unknown statement");
            }
        }

    }

    public void add(){
        System.out.print("In Finnish: ");
        String s = scanner.nextLine();
        System.out.print("Translation: ");
        String s1 = scanner.nextLine();

        dictionary.add(s, s1);
    }

    public void translate(){
        System.out.print("Give a word: ");
        String s = scanner.nextLine();

        System.out.print("Translation: ");

        System.out.println(dictionary.translate(s));
    }
}
