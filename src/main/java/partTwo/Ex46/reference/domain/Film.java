package partTwo.Ex46.reference.domain;

public class Film {

    private String name;

    public Film(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Film compared = (Film) obj;

        if (this.name == null || !this.name.equals(compared.getName())) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

}
