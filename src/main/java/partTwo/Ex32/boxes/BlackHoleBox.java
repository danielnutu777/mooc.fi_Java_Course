package partTwo.Ex32.boxes;

import java.util.ArrayList;
import java.util.List;

public class BlackHoleBox extends Box {

    private List<Thing> blackHoleBoxList;

    public BlackHoleBox(){
        blackHoleBoxList = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        blackHoleBoxList.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
