package problems;

public class Circle {
	float radius;

	public Circle(float radius) {
		this.radius = radius;
	}

	public Circle() {
		this.radius = 4.65f;
	}

	public String toString() {
		return this.radius + "";
	}

	public boolean equals(Circle newCircle) {
		if (this.radius == newCircle.radius)
			return true;
		return false;
	}

	public float area_of_circle() {
		return (float) (Math.PI * Math.pow(this.radius, 2));
	}

	public float area_of_circle(Circle c2) {
		return (float) (Math.PI * Math.pow(c2.radius, 2));
	}

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(6.3f);

		System.out.println(c1.equals(c2));
	}
}
