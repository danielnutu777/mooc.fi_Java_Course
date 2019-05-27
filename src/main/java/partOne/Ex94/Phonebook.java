import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> personList = new ArrayList<Person>();

    public void add(String name, String number){
        personList.add(new Person(name, number));
    }

    public void printAll(){
        for (Person p: personList) {
            System.out.println(p);
        }
    }

    public String searchNumber(String name){
        for (Person p: personList) {
            if(p.getName().equals(name)){
                return p.getNumber();
            }
        }
        return "number not known";
    }
}
