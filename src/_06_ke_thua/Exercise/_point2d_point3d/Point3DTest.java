package _06_ke_thua.Exercise._point2d_point3d;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D example = new Point3D();
        System.out.println(example);

        example = new Point3D(1.5f,2.3f,5.7f);
        System.out.println(example);

        example.setXYZ(3.2f, 1.6f, 2.5f);
        System.out.println(example);
    }
}
