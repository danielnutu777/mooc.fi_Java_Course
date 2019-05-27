package partTwo.Ex19.validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if(name == null || name.equals("") || name.length() > 40){
            throw new IllegalArgumentException("The name must not be null, empty, or longer than 40 characters. ");
        }
        this.name = name;
        if(age < 0 || age > 120){
            throw new IllegalArgumentException("The age must be between 0-120.");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
