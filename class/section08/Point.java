package section08;

public class Point {
	int x;
	int y;


public Point(int i, int j) {
		// TODO Auto-generated constructor stub
	}

public void setLocation(int newX, int newY) {
    x = newX;
    y = newY;
}

// previous solution of method translate
public void translate(int dx, int dy) {
    x = x + dx;
    y += dy;
}

// alternative solution of method translate// ���� translate()�� ���� ǥ����
public void translates(int dx, int dy) {
    setLocation(x + dx, y + dy);
}
}
