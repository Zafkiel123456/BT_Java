package Bai2_8;
public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        System.out.println(c1);

        MyCircle c2 = new MyCircle(3, 4, 5);
        System.out.println(c2);

        MyCircle c3 = new MyCircle(new MyPoint(6, 8), 2);
        System.out.println(c3);
        System.out.println(c2.getArea());
        System.out.println(c2.getCircumference());

        System.out.println(c1.distance(c2));
        System.out.println(c2.distance(c3));
        c1.setRadius(10);
        c1.setCenter(new MyPoint(1, 1));
        System.out.println(c1.getRadius() + " " + c1.getCenter());

        c1.setCenterX(7);
        c1.setCenterY(9);
        System.out.println(c1.getCenterX() + "," + c1.getCenterY());

        c1.setCenterXY(2, 3);
        int[] xy = c1.getCenterXY();
        System.out.println(xy[0] + "," + xy[1]);
    }
}