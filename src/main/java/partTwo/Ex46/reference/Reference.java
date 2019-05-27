package partTwo.Ex46.reference;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reference {

    private RatingRegister ratingRegister;

    public Reference(RatingRegister ratingRegister) {
        this.ratingRegister = ratingRegister;
    }

    public Film recommendFilm(Person person){
            List<Film> films = new ArrayList<Film>(ratingRegister.filmRatings().keySet());
            Collections.sort(films, new FilmComparator(ratingRegister.filmRatings()));
            if(ratingRegister.getPersonalRatings(person).keySet().containsAll(films)){
                return null;
            }
        for (int i = 0; i < films.size(); i++) {
            if(!ratingRegister.getPersonalRatings(person).containsKey(films.get(i))){
                return films.get(i);
            }
        }
            return null;
    }
}
