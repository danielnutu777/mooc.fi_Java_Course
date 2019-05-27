
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what?");
        int sum = 0;
        int a = reader.nextInt();
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println("Sum is: " + sum);
    }
}
