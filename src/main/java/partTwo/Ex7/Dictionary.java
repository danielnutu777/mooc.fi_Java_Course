import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> words;

    public Dictionary() {
        words = new HashMap<String, String>();
    }

    public String translate(String word){
        return words.get(word);
    }

    public void add(String word, String translation){
        words.put(word, translation);
    }

    public int amountOfWords(){
        return words.size();
    }

    public ArrayList<String> translationList(){

        ArrayList<String> translatedWords = new ArrayList<String>();

        for (String s: words.keySet()) {
            translatedWords.add(s + " = ");
        }

        int i = 0;
        for (String s: words.values()) {
            translatedWords.set(i, translatedWords.get(i) + s);
            i++;
        }

        return translatedWords;
    }
}
