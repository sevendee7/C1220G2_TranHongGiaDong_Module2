package _06_ke_thua.Exercise._point_and_movablePoint;

public class PointTest {
    public static void main(String[] args) {
        Point example = new Point();
        System.out.println(example);

        example = new Point(2.5f, 4.8f);
        System.out.println(example);

        example.setXY(3.5f, 4.8f);
        System.out.println(example);
    }
}
