package Point3D;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(2.5f,3.5f,4.5f);
        System.out.println(point3D);
        point3D.setX(2.3f);
        point3D.setY(4.8f);
        point3D.setZ(5.6f);
        System.out.println(point3D.toString());
    }
}
