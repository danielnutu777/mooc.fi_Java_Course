package partOne.Ex9;

import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        int a = reader.nextInt();
        System.out.print("Type another number: ");
        int b = reader.nextInt();
        float result = (float)a / b;
        System.out.println("Division: " + a + "/" + b + "=" + result);
    }
}
