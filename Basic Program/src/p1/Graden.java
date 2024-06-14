package p1;

public class Graden {
	public static void main(String[] args) {
		int row = 5, col = 4, tree = 16;
		if((tree%col==0) | (tree%col == 1)| (tree>=1 && tree<=col))
			System.out.println("Mango Tree");
		else
			System.out.println("Not");
	}
}
