package partTwo.Ex32.boxes;

import java.util.ArrayList;
import java.util.List;

public class OneThingBox extends Box {

    private List<Thing> oneThingList;

    public OneThingBox(){
        oneThingList = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if(oneThingList.size() == 0){
            oneThingList.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(oneThingList.contains(thing)){
            return true;
        }
        return false;
    }
}
