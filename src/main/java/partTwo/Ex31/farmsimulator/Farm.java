package partTwo.Ex31.farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive{
    private String ownerName;
    private Barn barn;
    private List<Cow> herd;

    public Farm(String ownerName, Barn barn) {
        this.ownerName = ownerName;
        this.barn = barn;
        herd = new ArrayList<Cow>();
    }

    @Override
    public void liveHour() {
        for (Cow c: herd) {
            c.liveHour();
        }
    }

    public void manageCows(){
        barn.takeCareOf(herd);
    }

    public String getOwner() {
        return ownerName;
    }

    public void addCow(Cow cow){
        herd.add(cow);
    }

    public void installMilkingRobot(MilkingRobot robot){
        barn.installMilkingRobot(robot);
    }
}
