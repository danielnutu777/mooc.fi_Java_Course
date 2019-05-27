
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();

        while(true){
            System.out.println("Type a word: ");
            String s = reader.nextLine();

            if(s.isEmpty()){
                System.out.println("You typed the following words: ");
                Collections.sort(words);
                for (String a: words) {
                    System.out.println(a);
                }
                break;
            }else{
                words.add(s);
            }
        }
    }
}
