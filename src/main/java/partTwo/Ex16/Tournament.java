import java.util.ArrayList;
import java.util.Collections;

public class Tournament{
    private ArrayList<Jumper> jumpers;
    private int jumperCounter = 1;
    private int tournamentCounter = 1;
    private int roundCounter = 1;

    public Tournament() {
        jumpers = new ArrayList<Jumper>();
    }

    public void add(Jumper jumper){
        jumpers.add(jumper);
    }

    public void printJumpers(){

        Collections.sort(jumpers);
        for (Jumper j: jumpers) {
            System.out.println("  " + jumperCounter + ". " + j + " (" + j.getPoints() + " points)");
            jumperCounter++;
        }
        System.out.println();
        jumperCounter = 1;
    }

    public void printTournamentResults(){
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
        System.out.println("Position    Name");
        for (Jumper j: jumpers) {
            System.out.println(tournamentCounter + "           " + j + " (" + j.getPoints() + " points" + ")");
            System.out.print("            jump lengths: ");

            for (int i = 0; i < j.getJumpLengths().size(); i++) {
                if(i != j.getJumpLengths().size()-1){
                    System.out.print(j.getJumpLengths().get(i) + " m, ");
                }else{
                    System.out.print(j.getJumpLengths().get(i) + " m");
                    System.out.println();
                }
            }

            tournamentCounter++;
        }

    }

    public void beginRound(){

        System.out.println("Round " + roundCounter);
        System.out.println();
        System.out.println("Jumping order:");

        printJumpers();
        System.out.println("Results of round " + roundCounter);

        for (Jumper j: jumpers) {
            j.jump(j);
        }
        roundCounter++;

    }
}
