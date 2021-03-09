package _review_oop.src._student_file_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonManager personManager = new PersonManager(new ArrayList<>());
        System.out.println("Enter size of list = ");
        int size = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i+1) + " student information: ");
            System.out.println("Enter student's name: ");
            String studentName = scanner.nextLine();
            System.out.println("Enter student's age: ");
            int studentAge = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter student's year of birth: ");
            int studentYearOfBirth = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter student's home town: ");
            String studentHomeTown = scanner.nextLine();
            System.out.println("Enter student's class: ");
            String studentClass = scanner.nextLine();
            System.out.println("Enter student's course: ");
            String studentCourse = scanner.nextLine();
            System.out.println("Enter student's semester: ");
            String studentSemester = scanner.nextLine();
            System.out.println("----------------------------");
            personManager.addPerson(new Student(studentName,studentAge,studentYearOfBirth
                    ,studentHomeTown,studentClass,studentCourse,studentSemester));
        }

        List<Person> showStudentList = new ArrayList<>();
        int count = 0;
        for (Person person : personManager.personList) {
            if (person.getYearOfBirth() == 1985) {
                showStudentList.add(person);
            }
            if (person.getHomeTown().equals("Thái Nguyên")) {
                count++;
            }
        }
        for (Person person : showStudentList) {
            System.out.println(person);
        }
        System.out.println("Có " + count + " học sinh có năm sinh 1985, quê ở Thái Nguyên");
    }
}
