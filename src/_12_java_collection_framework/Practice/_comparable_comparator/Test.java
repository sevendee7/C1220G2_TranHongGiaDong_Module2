package _12_java_collection_framework.Practice._comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("kien", 30, "HT");
        Student student1 = new Student("nam", 26, "HN");
        Student student2 = new Student("anh", 38, "HT");
        Student student3 = new Student("tung", 38, "HT");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sanh theo tuoi : ");
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}
