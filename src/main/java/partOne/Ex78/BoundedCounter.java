package partOne.Ex78;

public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        value++;
        if(value > upperLimit){
            value = 0;
        }

    }

    public String toString() {
        // write code here
        if(value < 10){
            return "0" + value;
        }
        return "" + value;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        if(value >= 0 && value <= upperLimit){
            this.value = value;
        }

    }

}
