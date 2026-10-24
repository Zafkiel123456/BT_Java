package Bai2_6;
public class TestMain {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        System.out.println(p1);                 // (0,0)

        MyPoint p2 = new MyPoint(3, 4);
        System.out.println(p2);                 // (3,4)

        p1.setXY(1, 2);
        System.out.println(p1.getX() + ", " + p1.getY());
        int[] xy = p1.getXY();
        System.out.println(xy[0] + ", " + xy[1]);

        System.out.println(p2.distance());          // 5.0
        System.out.println(p2.distance(0, 0));      // 5.0
        System.out.println(p1.distance(p2));        // 2.828...
    }
}
