package partTwo.Ex32.boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box {

    private int maxWeight;
    private List<Thing> boxList;

    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        boxList = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        int totalWeight = 0;
        for (Thing t: boxList) {
            totalWeight += t.getWeight();
        }

        if(thing.getWeight() + totalWeight <= maxWeight){
            boxList.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(boxList.contains(thing)){
            return true;
        }
        return false;
    }
}
