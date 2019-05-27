package partTwo.Ex46.reference.comparator;
import reference.domain.Film;
import reference.domain.Rating;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class FilmComparator implements Comparator<Film> {

    private Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.ratings = ratings;
    }

    @Override
    public int compare(Film o1, Film o2) {
        if(getAverageRating(o1) < getAverageRating(o2)){
            return 1;
        }
        if(getAverageRating(o1) > getAverageRating(o2)){
            return -1;
        }
        return 0;
    }

    public int getAverageRating(Film film){
        int avg = 0;

        for (Rating r: ratings.get(film)) {
            avg += r.getValue();
        }
        return avg;
    }
}
