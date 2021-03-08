package _review_oop.src._student_file_management;

import java.util.List;

public class PersonManager {
    List<Person> personList;

    public PersonManager(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(Person person) {
        this.personList.add(person);
    }
}
