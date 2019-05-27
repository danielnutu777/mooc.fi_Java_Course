package partTwo.Ex25.tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {

    private List<String> charList;
    private int duplicates;

    public PersonalDuplicateRemover() {
        duplicates = 0;
        charList = new ArrayList<String>();
    }

    @Override
    public void add(String characterString) {
        if(charList.contains(characterString)){
            duplicates++;
        }
        charList.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        Set<String> uniqueCharSet =  new HashSet<String>();
        for (String s: charList) {
            uniqueCharSet.add(s);
        }
        return uniqueCharSet;
    }

    @Override
    public void empty() {
        duplicates = 0;
        charList = new ArrayList<String>();
    }
}
