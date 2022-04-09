package goorm1;

public class distance {
	
    }

	public double distance(Point other) {
	    int x,y;
		int dx = x - other.x;
	    int dy = y - other.y;
	    return Math.sqrt(dx * dx + dy * dy);
	}
	


	public double distanceFromOrigin() {
	    return Math.sqrt(x * x + y * y);
	}


}
