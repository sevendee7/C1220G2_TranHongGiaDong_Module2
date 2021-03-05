package _05_access_modifier_static_method_static_property.Practice.com.codegym;

public class Student {
    private int rollno;
    private  String name;
    private static String college = "BBDIT";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
