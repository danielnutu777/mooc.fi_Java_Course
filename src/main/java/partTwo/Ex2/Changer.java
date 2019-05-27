package partTwo.Ex2;

import java.util.ArrayList;

public class Changer {
    private ArrayList<Change> changerList;

    public Changer() {
        changerList = new ArrayList<Change>();
    }

    public void addChange(Change change){
        changerList.add(change);
    }

    public String change(String characterString){
        for (Change c: changerList) {
            characterString = c.change(characterString);
        }
        return characterString;
    }
}
