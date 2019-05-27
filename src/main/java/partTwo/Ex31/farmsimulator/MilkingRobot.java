package partTwo.Ex31.farmsimulator;

public class MilkingRobot {
    private BulkTank tank;

    public MilkingRobot(){
        tank = null;
    }

    public BulkTank getBulkTank(){
        return tank;
    }

    public void setBulkTank(BulkTank tank){
        this.tank = tank;
    }

    public void milk(Milkable milkable){
        if(this.tank == null){
            throw new IllegalStateException("No tank");
        }else{
            tank.addToTank(milkable.milk());
        }
    }
}
