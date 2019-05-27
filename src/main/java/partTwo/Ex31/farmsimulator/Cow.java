package partTwo.Ex31.farmsimulator;

import java.util.Random;

public class Cow implements Milkable,Alive {
    private String name;
    private double udderCapacity;
    private double milk;
    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        name = NAMES[new Random().nextInt(NAMES.length)];
        udderCapacity = 15 + new Random().nextInt(26);
        milk = 0;
    }

    public Cow(String name) {
        this.name = name;
        udderCapacity = 15 + new Random().nextInt(26);
        milk = 0;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return udderCapacity;
    }

    public double getAmount(){
        return milk;
    }

    @Override
    public double milk() {
        double milkTaken = this.milk;
        this.milk = 0;
        return milkTaken;
    }

    @Override
    public void liveHour() {
        double[] milkPerHour = {0.7, 0.8, 0.9, 1.0, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2.0};
        milk += milkPerHour[new Random().nextInt(milkPerHour.length)];

        if (this.milk > this.udderCapacity) {
            this.milk = this.udderCapacity;
        }
    }

    @Override
    public String toString() {
        return this.name + " " + Math.ceil(this.milk) + "/" + Math.ceil(this.udderCapacity);
    }
}
