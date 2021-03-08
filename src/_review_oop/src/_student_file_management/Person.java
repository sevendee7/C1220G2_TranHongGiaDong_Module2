package _review_oop.src._student_file_management;

public class Person {
    private String name;
    private int age;
    private int yearOfBirth;
    private String homeTown;

    public void Person() {}

    public Person(String name, int age, int yearOfBirth, String homeTown) {
        this.name = name;
        this.age = age;
        this.yearOfBirth = yearOfBirth;
        this.homeTown = homeTown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", yearOfBirth=" + yearOfBirth +
                ", homeTown='" + homeTown + '\'' +
                '}';
    }
}
