import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while(true){
            System.out.print("Type a word: ");
            String s = reader.nextLine();

            if(s.isEmpty()){
                System.out.println("You typed the following words: ");
                for (String a : words) {
                    System.out.println(a);
                }
                break;
            }else{
                words.add(s);
            }


        }
    }
}
