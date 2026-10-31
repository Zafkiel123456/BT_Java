package Bai2_9;
public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        System.out.println(t1);
        System.out.println(t1.getPerimeter());
        System.out.println(t1.getType());
        t1.printType();
        MyTriangle t2 = new MyTriangle(new MyPoint(0, 0), new MyPoint(4, 0), new MyPoint(2, 3));
        System.out.println(t2);
        System.out.println(t2.getPerimeter());
        System.out.println(t2.getType());
        t2.printType();
        MyTriangle t3 = new MyTriangle(0, 0, 0, 0, 0, 0);
        System.out.println(t3.getType());         // Equilateral
    }
}