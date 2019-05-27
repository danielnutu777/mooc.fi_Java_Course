package partTwo.Ex46.reference.domain;

public enum Rating {

    BAD(-5),
    MEDIOCRE(-3),
    NOT_WATCHED(0),
    NEUTRAL(1),
    FINE(3),
    GOOD(5);


    private int ratingValue;

    Rating(int ratingValue) {
        this.ratingValue = ratingValue;
    }

    public int getValue(){
        return this.ratingValue;
    }
}
