package partTwo.Ex31.farmsimulator;

import java.util.Collection;

public class Barn {
    private BulkTank tank;
    private MilkingRobot robot;

    public Barn(BulkTank tank){
        this.tank = tank;
        this.robot = null;
    }

    public BulkTank getBulkTank(){
        return tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.robot = milkingRobot;
        this.robot.setBulkTank(tank);
    }

    public void takeCareOf(Cow cow){
        if(robot == null){
            throw new IllegalStateException("robot not installed");
        }else{
            robot.milk(cow);
        }
    }

    public void takeCareOf(Collection<Cow> cows){
        if(robot == null){
            throw new IllegalStateException("robot not installed");
        }else{
            for (Cow c: cows) {
                robot.milk(c);
            }
        }
    }

    @Override
    public String toString() {
        return tank.toString();
    }
}
