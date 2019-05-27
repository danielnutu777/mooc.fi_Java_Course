package partTwo.Ex45.personnel;

public class Person {
    private String name;
    private Education educationTitle;

    public Person(String name, Education educationTitle) {
        this.name = name;
        this.educationTitle = educationTitle;
    }

    public Education getEducation() {
        return educationTitle;
    }

    @Override
    public String toString() {
        return this.name + ", " + getEducation();
    }
}
