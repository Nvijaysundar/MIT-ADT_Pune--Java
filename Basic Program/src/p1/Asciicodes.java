package p1;

public class Asciicodes {
	public static void main(String[] args) {
		for(int i=0;i<=255;i++)
		{
			System.out.printf("%d : %c ",i,i);
			if(i%10 ==0)
				System.out.println();
		}
	}
}
