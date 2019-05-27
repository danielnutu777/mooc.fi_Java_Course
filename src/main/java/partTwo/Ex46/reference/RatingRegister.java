package partTwo.Ex46.reference;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RatingRegister {

    private Map<Film, List<Rating>> filmWithRatings;
    private Map<Person, Map<Film, Rating>> personWithRatings;

    public RatingRegister() {
        this.filmWithRatings = new HashMap<Film, List<Rating>>();
        this.personWithRatings = new HashMap<Person, Map<Film, Rating>>();
    }

    public void addRating(Film film, Rating rating){
        if(!filmWithRatings.containsKey(film)){
            filmWithRatings.put(film, new ArrayList<Rating>());
            filmWithRatings.get(film).add(rating);
        } else {
            filmWithRatings.get(film).add(rating);
        }
    }

    public List<Rating> getRatings(Film film){
        return filmWithRatings.get(film);
    }

    public Map<Film, List<Rating>> filmRatings(){
        return filmWithRatings;
    }

    public void addRating(Person person, Film film, Rating rating){
        if(!personWithRatings.containsKey(person)){
            personWithRatings.put(person, new HashMap<Film, Rating>());
            personWithRatings.get(person).put(film, rating);
            addRating(film, rating);
        } else {
            personWithRatings.get(person).put(film, rating);
            addRating(film, rating);
        }
    }

    public Rating getRating(Person person, Film film){
        if(personWithRatings.get(person).containsKey(film)){
            return personWithRatings.get(person).get(film);
        } else {
            return Rating.NOT_WATCHED;
        }
    }

    public Map<Film, Rating> getPersonalRatings(Person person){
        if(personWithRatings.containsKey(person)){
            return personWithRatings.get(person);
        }
        return new HashMap<Film, Rating>();
    }

    public List<Person> reviewers(){
        List<Person> personList = new ArrayList<Person>();
        for (Person p: personWithRatings.keySet()) {
            personList.add(p);
        }
        return personList;
    }
}
