package problems;

public class Point {
	double x, y;

	public Point() {
		this.x = 5.6;
		this.y = 5.33;
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void axisQuadFinder(Point p1) {
		if (p1.x == 0 && p1.y == 0)
			System.out.println("Origin");
		else if (p1.x == 0) {
			System.out.println("Y-axis");
		} else if (p1.y == 0) {
			System.out.println("X-axis");
		} else if (p1.x > 0 && p1.y > 0)
			System.out.println("1 Quadrant");
		else if (p1.x > 0 && p1.y < 0)
			System.out.println("4 Quadrant");
		else if (p1.x < 0 && p1.y > 0)
			System.out.println("2nd Quadrant");
		else
			System.out.println("3rd Quadrant");
	}
	
	

}
