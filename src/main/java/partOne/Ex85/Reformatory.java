public class Reformatory {

    private int counter;
    public int weight(Person person) {
        // return the weight of the person
        counter++;
        return person.getWeight();
    }

    public void feed(Person person){
        person.setWeight(person.getWeight()+ 1);
    }

    public int totalWeightsMeasured(){
        return counter;
    }

}
