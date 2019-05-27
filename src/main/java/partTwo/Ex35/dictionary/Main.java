package partTwo.Ex35.dictionary;

public class Main {
    public static void main(String[] args) throws Exception{
        // Test your dictionary here
        MindfulDictionary dict = new MindfulDictionary("src/words.txt");
        dict.load();

// using the dictionary

        dict.save();
    }
}
