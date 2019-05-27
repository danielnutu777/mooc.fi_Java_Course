public class Counter {

    private int startingValue;
    private boolean check;

    public Counter(int startingValue, boolean check){
        this.startingValue = startingValue;
        this.check = check;
    }

    public Counter(int startingValue){
        this.startingValue = startingValue;
    }

    public Counter(boolean check){
        this.check = check;
        this.startingValue = 0;
    }

    public Counter(){
        this.startingValue = 0;
    }


    public int value(){
        return startingValue;
    }
    public void increase(){
        startingValue++;
    }
    public void decrease(){
        if(startingValue == 0 && check){
            return;
        }else{
            startingValue--;
        }
    }

    public void increase(int increaseAmount){
        if(increaseAmount < 0){
            return;
        }else{
            startingValue += increaseAmount;
        }

    }

    public void decrease(int decreaseAmount){

        if(decreaseAmount < 0){
            return;
        }
        if(startingValue - decreaseAmount < 0 && check){
            startingValue = 0;
            return;
        }

        startingValue -= decreaseAmount;
    }
}
