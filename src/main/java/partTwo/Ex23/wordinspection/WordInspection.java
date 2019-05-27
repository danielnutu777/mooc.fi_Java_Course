package partTwo.Ex23.wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

    private File file;
    private List<String> list;

    public WordInspection(File file) throws Exception {
        this.file = file;
        list = new ArrayList<String>();
        addFileToList();
    }

    public int wordCount() {
        int count = 0;
        for (String s : list) {
            count++;
        }
        return count;
    }

    public List<String> wordsContainingZ() {
        List<String> listContainingZWords = new ArrayList<String>();
        for (String s : list) {
            if (s.contains("z")) {
                listContainingZWords.add(s);
            }
        }
        return listContainingZWords;
    }

    public List<String> wordsEndingInL() {
        List<String> listContainingLWords = new ArrayList<String>();
        for (String s : list) {
            if (s.charAt(s.length() - 1) == 'l') {
                listContainingLWords.add(s);
            }
        }
        return listContainingLWords;
    }

    public List<String> palindromes() {
        List<String> palindromeList = new ArrayList<String>();
        for (String s : list) {
            if (s.equals(createPalindrome(s))) {
                palindromeList.add(s);
            }
        }
        return palindromeList;
    }

    public List<String> wordsWhichContainAllVowels() {
        List<String> listWordsVowels = new ArrayList<String>();
        for (String s : list) {
            if (checkIfContainsVowel(s)) {
                listWordsVowels.add(s);
            }
        }
        return listWordsVowels;
    }

    public void addFileToList() throws Exception {
        Scanner scanner = new Scanner(file, "UTF-8");
        while (scanner.hasNext()) {
            list.add(scanner.next());
        }
    }

    public String createPalindrome(String word) {
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        return reversedWord;
    }

    public boolean checkIfContainsVowel(String word) {
        int count = 0;
        String[] vowelsArr = {"a", "e", "i", "o", "u", "y", "ä", "ö"};
        for (int i = 0; i < vowelsArr.length; i++) {
            if (word.contains(vowelsArr[i])) {
                count++;
            }
        }
        if(count == 8){
            return true;
        }
        return false;
    }
}
