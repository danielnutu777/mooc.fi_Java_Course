import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things;
    private int maxWeightLimit;


    public Suitcase(int maxWeightLimit) {
        things = new ArrayList<Thing>();
        this.maxWeightLimit = maxWeightLimit;
    }

    public void addThing(Thing thing){
        if(this.maxWeightLimit >= totalWeight() + thing.getWeight()){
            things.add(thing);
        }

    }

    @Override
    public String toString() {
        if(things.size() == 0){
            return "empty" + " (" + totalWeight() + " kg)";
        }
        if(things.size() == 1){
            return things.size() + " thing" + " (" + totalWeight() + " kg)";
        }
        return things.size() + " things" + " (" + totalWeight() + " kg)";
    }

    public void printThings(){
        for (Thing t: things) {
            System.out.println(t);
        }
    }

    public int totalWeight(){
        int sum = 0;
        for (Thing t: things) {
            sum += t.getWeight();
        }
        return sum;
    }

    public Thing heaviestThing(){
        int heaviest = -1;
        for (Thing t: things) {
            if(t.getWeight() > heaviest){
                heaviest = t.getWeight();
            }
        }
        for (Thing t: things) {
            if(t.getWeight() == heaviest){
                return t;
            }
        }
        return null;
    }
}
