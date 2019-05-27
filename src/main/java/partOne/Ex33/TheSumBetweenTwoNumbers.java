
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        int a = reader.nextInt();
        System.out.println("Last: ");
        int b = reader.nextInt();
        int sum = 0;
        for (int i = a; i <= b ; i++) {
            sum+=i;
        }
        System.out.println("Sum is: " + sum);
    }
}
