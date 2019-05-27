package partTwo.Ex45.personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> personList;

    public Employees() {
        this.personList = new ArrayList<Person>();
    }

    public void add(Person person){
        personList.add(person);
    }

    public void add(List<Person> persons){
        for (Person person : persons) {
            personList.add(person);
        }
    }

    public void print(){
        Iterator<Person> iterator = personList.iterator();
        while(iterator.hasNext()){
            Person p = iterator.next();
            System.out.println(p);
        }
    }

    public void print(Education education){
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()){
            Person p = iterator.next();
            if(p.getEducation()== education){
                System.out.println(p);
            }
        }
    }

    public void fire(Education education){
        Iterator<Person> iterator = personList.iterator();
        while(iterator.hasNext()){
            Person p = iterator.next();
            if(p.getEducation() == education){
                iterator.remove();
            }
        }
    }
}
