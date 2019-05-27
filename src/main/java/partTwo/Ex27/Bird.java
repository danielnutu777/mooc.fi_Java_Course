
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public boolean equals(Object obj) {
        Bird bird = (Bird) obj;
        if(this.latinName.equals(((Bird) obj).latinName) && this.ringingYear == ((Bird) obj).ringingYear){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.latinName.hashCode() + this.ringingYear;
    }
}


