import java.util.*;

public class Jumper implements Comparable<Jumper>{
    private String name;
    private int points;
    private ArrayList<Integer> jumpLengths;

    public Jumper(String name) {
        this.name = name;
        this.points = 0;
        jumpLengths = new ArrayList<Integer>();
    }
    public void setPoints(int points) {
        this.points += points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public ArrayList<Integer> getJumpLengths() {
        return jumpLengths;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public int compareTo(Jumper o) {
        if(this.points == o.points){
            return 0;
        }else if(this.points < o.points){
            return -1;
        }else{
            return 1;
        }
    }

    public void jump(Jumper j){
        int jumpLength = getRandomNumberInRange(60,120);
        this.jumpLengths.add(jumpLength);
        ArrayList<Integer> votes = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            votes.add(getRandomNumberInRange(10,20));
        }
            System.out.println("  " + j.getName());
            System.out.println("    " + "length: " + jumpLength);
            System.out.println("    " + "judge votes: " + Arrays.toString(votes.toArray()));

            int pointsAfterJump = 0;
            for (int i = 0; i < votes.size(); i++) {
                int indexOfMin = votes.indexOf(Collections.min(votes));
                int indexOfMax = votes.indexOf(Collections.max(votes));
                if(i != indexOfMin && i != indexOfMax){
                    pointsAfterJump += votes.get(i);
                }
            }
            j.setPoints(jumpLength + pointsAfterJump);


    }
    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
