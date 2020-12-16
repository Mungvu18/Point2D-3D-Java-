package Point2D;

import Point2D.Ponit2D;

public class TestPoint2D {
    public static void main(String[] args) {
        Ponit2D ponit2D = new Ponit2D();
        System.out.println(ponit2D);
        ponit2D = new Ponit2D(1,2);
        System.out.println(ponit2D);
        ponit2D.setX(4.5f);
//        ponit2D.setY(2.5f);
        System.out.println(ponit2D);
    }
}
