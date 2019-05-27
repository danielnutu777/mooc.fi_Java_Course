package partTwo.Ex30.containers;

public class ProductContainerRecorder extends ProductContainer {

    private ContainerHistory containerHistory;
    public ProductContainerRecorder(String productName, double capacity, double initialValue) {
        super(productName, capacity);
        containerHistory = new ContainerHistory();
        addToTheContainer(initialValue);
    }

    public String history(){
        return containerHistory.toString();
    }


    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        containerHistory.add(this.getVolume());
    }

    public double takeFromTheContainer(double amount){
        double firstVol = this.getVolume();
        super.takeFromTheContainer(amount);
        this.containerHistory.add(this.getVolume());
        return firstVol - this.getVolume();
    }

    public void printAnalysis(){
        System.out.println("Product: " + this.getName() + "\n"
                + "History: " + this.history() + "\n"
                + "Greatest product amount: " + containerHistory.maxValue() + "\n"
                + "Smallest product amount: " + containerHistory.minValue() + "\n"
                + "Average: " + containerHistory.average() + "\n"
                + "Greatest change: " + containerHistory.greatestFluctuation() + "\n"
                + "Variance: " + containerHistory.variance());
    }
}
