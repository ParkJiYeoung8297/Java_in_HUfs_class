package section08;

public class PointMain {

	public static void main(String[] args) {
        // create two Point objects
        Point p1 = new Point();
        p1.y = 2;
        Point p2 = new Point();
        p2.x = 4;

        System.out.println(p1.x + "," + p1.y);   // 0,2���

        // move p2 and then print it
        p2.x += 2; ///p2�� x��ǥ�� 2���ϱ�
        p2.y++;   //p2�� y��ǥ�� 1���ϱ�
        //p2.translate(2,1); �� ���� ���� 
        System.out.println(p2.x + "," + p2.y);   // 6,1
    }


}
