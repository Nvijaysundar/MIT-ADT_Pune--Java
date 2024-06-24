package primitive;
import java.util.Scanner;
public class ExamplewWithInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int[] arr = new int[sc.nextInt()];
		
		System.out.println("Enter Array Members");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Array : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println("\nArray with new For loop: ");
		for(int temp :arr)
		{
			System.out.println(temp+" ");
		}
		
		sc.close();
	}
}
