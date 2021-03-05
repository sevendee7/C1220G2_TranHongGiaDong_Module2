package _06_ke_thua.Exercise._circle_and_cylinder;

public class CircleTest {
    public static void main(String[] args) {
        Circle example = new Circle();
        System.out.println(example);
        System.out.println("Area = " + example.getArea());
        System.out.println("Perimeter = " + example.getPerimeter());
        System.out.println();

        example = new Circle(2.3, "red");
        System.out.println(example);
        System.out.println("Area = " + example.getArea());
        System.out.println("Perimeter = " + example.getPerimeter());
        System.out.println();
    }
}
