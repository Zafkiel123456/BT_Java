package Bai2_7;
public class TestMyLine {
    public static void main(String[] args) {
        MyLine l1 = new MyLine(0, 0, 3, 4);
        System.out.println(l1);                       // MyLine[begin=(0,0),end=(3,4)]
        System.out.println(l1.getLength());           // 5.0
        System.out.println(l1.getGradient());         // 0.9272952180016122

        MyLine l2 = new MyLine(new MyPoint(1, 1), new MyPoint(5, 1));
        System.out.println(l2);
        System.out.println(l2.getLength());           // 4.0
        System.out.println(l2.getGradient());         // 0.0

        l2.setBegin(new MyPoint(2, 2));
        l2.setEnd(new MyPoint(6, 5));
        System.out.println(l2.getBegin() + " " + l2.getEnd());

        l2.setBeginX(10);
        l2.setBeginY(20);
        l2.setEndX(30);
        l2.setEndY(40);
        System.out.println(l2.getBeginX() + "," + l2.getBeginY()
                + " -> " + l2.getEndX() + "," + l2.getEndY());

        l2.setBeginXY(1, 2);
        l2.setEndXY(3, 4);
        int[] b = l2.getBeginXY();
        int[] e = l2.getEndXY();
        System.out.println(b[0] + "," + b[1] + " -> " + e[0] + "," + e[1]);
    }
}
