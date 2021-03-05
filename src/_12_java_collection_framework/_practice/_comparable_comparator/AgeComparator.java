package _12_java_collection_framework.Practice._comparable_comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator <Student> {
    @Override
    public int compare(Student obj1, Student obj2) {
        if (obj1.getAge() > obj2.getAge()) {
            return 1;
        } else if (obj1.getAge() == obj2.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }
}
