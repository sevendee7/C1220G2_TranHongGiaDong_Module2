package _06_ke_thua.Exercise._shape_triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle example = new Triangle();
        System.out.println(example);
        System.out.println();

        example = new Triangle(2.5, 3.5, 7.5);
        example.setColor("Red");
        example.setFilled(false);
        System.out.println(example);
    }
}
