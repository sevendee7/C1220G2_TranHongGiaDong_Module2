package _review_oop.src._student_file_management;

public class Student extends Person{
    private String studentClass;
    private String studentCourse;
    private String studentSemester;

    public Student(String name, int age, int yearOfBirth, String homeTown,
                   String studentClass, String studentCourse, String studentSemester) {
        super(name, age, yearOfBirth, homeTown);
        this.studentClass = studentClass;
        this.studentCourse = studentCourse;
        this.studentSemester = studentSemester;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public String getStudentSemester() {
        return studentSemester;
    }

    public void setStudentSemester(String studentSemester) {
        this.studentSemester = studentSemester;
    }

    @Override
    public String toString() {
            return  "Student{" +
                    "studentName='" + super.getName() + '\'' +
                    ", studentAge=" + super.getAge() +
                    ", studentYearOfBirth=" + super.getYearOfBirth() +
                    ", studentHomeTown='" + super.getHomeTown() + '\'' +
                    ", studentClass='" + studentClass + '\'' +
                    ", studentCourse='" + studentCourse + '\'' +
                    ", studentSemester='" + studentSemester + '\'' +
                    '}';
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(obj == null || !(obj instanceof Student)){
//            return false;
//        }
//
//        Student otherStudent = (Student) obj;
//        if(this.getYearOfBirth() == 1985){
//            return true;
//        }
//        return false;
//    }
}
