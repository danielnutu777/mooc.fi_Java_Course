import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        NumberStatistics numberStatistics = new NumberStatistics();
        NumberStatistics numberStatistics1 = new NumberStatistics();
        NumberStatistics numberStatistics2 = new NumberStatistics();


        System.out.println("Type numbers: ");
        while (true) {
            int userNumber = reader.nextInt();
            if (userNumber > 0) {
                numberStatistics.addNumber(userNumber);
            } else {
                System.out.println("sum: " + numberStatistics.sum());
                System.out.println("sum of even: " + numberStatistics1.sum());
                System.out.println("sum of odd: " + numberStatistics2.sum());
                break;
            }

            if(userNumber % 2 == 0){
                numberStatistics1.addNumber(userNumber);
            } else {
                numberStatistics2.addNumber(userNumber);
            }

        }
    }
}
