package partOne.Ex23;

import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);


        while(true){
            System.out.print("Insert temperature: ");
            double a = Double.parseDouble(reader.nextLine());

            if(a >= -30 && a <= 40){
                Graph.addNumber(a);
            }
        }
        // Write your code here. 

        // Graph is used as follows:

        // Remove or comment out these lines above before trying to run the tests.

    }
}
