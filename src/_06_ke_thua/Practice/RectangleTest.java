package _06_ke_thua.Practice;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle example = new Rectangle();
        System.out.println(example);
        System.out.println("Area = " + example.getArea());
        System.out.println("Perimeter = " + example.getPerimeter());
        System.out.println();

        example = new Rectangle(2.3, 5.8);
        System.out.println(example);
        System.out.println("Area = " + example.getArea());
        System.out.println("Perimeter = " + example.getPerimeter());
        System.out.println();

        example = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(example);
        System.out.println("Area = " + example.getArea());
        System.out.println("Perimeter = " + example.getPerimeter());
        System.out.println();
    }
}
