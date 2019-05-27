package partTwo.Ex18.moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author
 */
public class Packer {

    private final int packerVol;
    private final List<Box> boxes;

    public Packer(int boxesVolume) {
        this.packerVol = boxesVolume;
        this.boxes = new ArrayList<Box>();
    }

    public List<Box> packThings(List<Thing> things) {

        int i = 0;
        for (Thing thing : things) {
            boxes.add(new Box(this.packerVol));
            boxes.get(i).addThing(thing);
            i++;
        }
        return boxes;
    }
}