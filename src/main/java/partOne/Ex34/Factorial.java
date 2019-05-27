import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a = reader.nextInt();
        int result = 1;
        for (int i = 2; i <= a ; i++) {
            result *= i;
        }
        System.out.println("Factorial is " + result);
    }
}
