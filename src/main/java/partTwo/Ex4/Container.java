import java.util.ArrayList;

public class Container {
    private int weightLimit;
    private ArrayList<Suitcase> container;

    public Container(int weightLimit) {
        this.weightLimit = weightLimit;
        container = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase){
        if(this.weightLimit >= suitcaseTotalWeight() + suitcase.totalWeight()){
            container.add(suitcase);
        }
    }

    @Override
    public String toString() {
        return container.size() + " suitcases" + " (" + suitcaseTotalWeight() + " kg)";
    }

    public void printThings(){
        for (Suitcase s: container) {
            s.printThings();
        }
    }

    public int suitcaseTotalWeight(){
        int sum = 0;
        for (Suitcase s: container) {
            sum += s.totalWeight();
        }
        return sum;
    }
}
