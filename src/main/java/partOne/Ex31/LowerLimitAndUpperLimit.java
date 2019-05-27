
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int a = reader.nextInt();
        System.out.println("Last: ");
        int b = reader.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }

        // write your code here

    }
}
