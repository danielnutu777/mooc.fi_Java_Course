package partTwo.Ex46.reference.comparator;
import reference.domain.Person;
import java.util.Comparator;
import java.util.Map;

public class PersonComparator implements Comparator<Person> {

    private Map<Person, Integer> peopleIdentities;

    public PersonComparator(Map<Person, Integer> peopleIdentities){
        this.peopleIdentities = peopleIdentities;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if(peopleIdentities.get(o1) < peopleIdentities.get(o2)){
            return 1;
        }

        if(peopleIdentities.get(o1) > peopleIdentities.get(o2)){
            return -1;
        }
        return 0;
    }
}
