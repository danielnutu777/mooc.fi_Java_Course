import java.util.ArrayList;

public class Box implements ToBeStored {
    private ArrayList<ToBeStored> storage;
    private double maximumWeight;

    public Box(double maximumWeight) {
        this.maximumWeight = maximumWeight;
        storage = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored toBeStored){
        if(weight() + toBeStored.weight() <= maximumWeight){
            storage.add(toBeStored);
        }
    }

    public double weight(){
        double sum = 0;
        for (ToBeStored t: storage) {
            sum += t.weight();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Box: " + storage.size() + " things, total weight " + weight() + " kg";
    }
}
