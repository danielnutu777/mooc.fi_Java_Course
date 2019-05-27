
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList
        ArrayList<String> words = new ArrayList<String>();

        while(true){
            System.out.println("Type a word: ");
            String s = reader.nextLine();

            if(words.contains(s)){
                System.out.println("You gave the word " + s + " twice");
                break;
            }else{
                words.add(s);
            }
        }


        
    }
}
