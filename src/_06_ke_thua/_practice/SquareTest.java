package _06_ke_thua.Practice;

public class SquareTest {
    public static void main(String[] args) {
        Square example = new Square();
        System.out.println(example);
        System.out.println("Area = " + example.getArea());
        System.out.println("Perimeter = " + example.getPerimeter());
        System.out.println();

        example = new Square(2.3);
        System.out.println(example);
        System.out.println("Area = " + example.getArea());
        System.out.println("Perimeter = " + example.getPerimeter());
        System.out.println();

        example = new Square(5.8, "yellow", true);
        System.out.println(example);
        System.out.println("Area = " + example.getArea());
        System.out.println("Perimeter = " + example.getPerimeter());
        System.out.println();
    }
}
