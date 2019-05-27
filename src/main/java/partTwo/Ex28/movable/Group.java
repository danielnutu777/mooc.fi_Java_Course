package partTwo.Ex28.movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    private List<Movable> objectList;

    public Group() {
        this.objectList = new ArrayList<Movable>();
    }

    @Override
    public String toString() {
        String s = "";
        for (Movable m: objectList) {
            s += m.toString() +"\n";
        }
        return s;
    }

    public void addToGroup(Movable movable){
        objectList.add(movable);
    }

    public void move(int dx, int dy){
        for (Movable m: objectList) {
            m.move(dx, dy);
        }
    }
}
