import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        Random random = new Random();

        while(numbers.size() < 7){
            int drawnNumber = random.nextInt(40);
            if(containsNumber(drawnNumber) == false && drawnNumber != 0){
                numbers.add(drawnNumber);
            }
        }

    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if(numbers.contains(number)){
            return true;
        }
        return false;
    }
}
