
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while(true){
            System.out.print("name: ");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            System.out.print("studentnumber: ");
            String number = scanner.nextLine();

            list.add(new Student(name, number));

        }
        for (Student s: list) {
            System.out.println(s);
        }
        System.out.print("Give search term: ");
        String searchTerm = scanner.nextLine();

        for (Student s : list) {
            if(s.getName().contains(searchTerm)){
                System.out.println("Result: \n" + s);
            }
        }
    }
}
