package partTwo.Ex32.boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        this.name = name;
        if(weight >= 0){
            this.weight = weight;
        }else{
            throw new IllegalArgumentException();
        }

    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        Thing thing = (Thing)obj;
        if(this.name.equals(thing.name)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
