package _06_ke_thua.Exercise._point_and_movablePoint;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint example = new MovablePoint();
        System.out.println(example);

        example = new MovablePoint(1.3f, 2.5f, 3.57f,4.59f);
        example.move();
        System.out.println(example);

        example = new MovablePoint(3.25f, 5.36f);
        System.out.println(example);

        example.move();
        System.out.println(example);
    }
}
