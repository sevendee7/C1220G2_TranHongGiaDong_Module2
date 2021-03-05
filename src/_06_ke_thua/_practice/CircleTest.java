package _06_ke_thua.Practice;

public class CircleTest {
    public static void main(String[] args) {
        Circle example = new Circle();
        System.out.println(example);
        System.out.println("Area = " + example.getArea());
        System.out.println("Perimeter = " + example.getPerimeter());
        System.out.println();

        example = new Circle(3.5);
        System.out.println(example);
        System.out.println("Area = " + example.getArea());
        System.out.println("Perimeter = " + example.getPerimeter());
        System.out.println();

        example = new Circle(3.5, "indigo", false);
        System.out.println(example);
        System.out.println("Area = " + example.getArea());
        System.out.println("Perimeter = " + example.getPerimeter());
        System.out.println();
    }
}
