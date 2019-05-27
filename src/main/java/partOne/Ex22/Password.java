package partOne.Ex22;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String s;

        while(true){
            System.out.println("Type the password: ");
            s = reader.nextLine();
            if(s.equals(password)){
                System.out.println("Right!");
                System.out.println("The secret is: jryy qbar!");
                break;
            }else{
                System.out.println("Wrong!");
            }
        }

        // Write your code here
    }
}
