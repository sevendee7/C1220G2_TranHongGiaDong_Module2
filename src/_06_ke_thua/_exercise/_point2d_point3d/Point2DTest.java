package _06_ke_thua.Exercise._point2d_point3d;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D example = new Point2D();
        System.out.println(example);

        example = new Point2D(1.5f, 3.7f);
        System.out.println(example);

        example.setXY(2.5f, 3.5f);
        System.out.println(example);
    }
}
