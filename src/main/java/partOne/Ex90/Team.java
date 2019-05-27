import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> playerList =  new ArrayList<Player>();
    private int maxPlayers = 16;


    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player){
        if(playerList.size() < maxPlayers){
            playerList.add(player);
        }

    }

    public void printPlayers(){
        for (Player p: playerList) {
            System.out.println(p);
        }
    }
    public void setMaxSize(int maxSize){
        maxPlayers = maxSize;
    }
    public int size(){
        return playerList.size();
    }

    public int goals(){
        int sumOfGoals = 0;
        for (Player p: playerList) {
            sumOfGoals += p.goals();
        }
        return sumOfGoals;
    }

}
