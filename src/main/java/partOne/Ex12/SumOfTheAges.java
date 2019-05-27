package partOne.Ex12;

import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.print("Type your name : ");
        String name = reader.nextLine();
        System.out.print("Type your age: ");
        int age = reader.nextInt();

        System.out.print("Type your name : ");
        String name2 = reader.next();
        System.out.print("Type your age: ");
        int age2 = reader.nextInt();
        int sum = age + age2;

        System.out.println(name + " and " + name2 + " are " + sum + " years old in total.");
    }
}
/*Type your name: Matti
Type your age: 14

Type your name: Arto
Type your age: 12

Matti and Arto are 26 years old in total.*/