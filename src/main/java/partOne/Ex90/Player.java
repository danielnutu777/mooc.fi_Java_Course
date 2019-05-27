public class Player {
    private String name;
    private int amountOfGoals;


    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int amountOfGoals) {
        this.name = name;
        this.amountOfGoals = amountOfGoals;
    }

    public String getName() {
        return name;
    }

    public int goals() {
        return amountOfGoals;
    }

    @Override
    public String toString() {
        return name + ", " + "goals " + amountOfGoals;
    }


}
