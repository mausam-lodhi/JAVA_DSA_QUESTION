import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the no. : ");
		int a = input.nextInt();
		int c = fact(a);
		System.out.print("Factorial= : " + c);
	}
	public static int fact(int a) {
		int fact = 1 ;
		for (int i = 1 ; i <= a; a--) {
			fact = fact * a ;
		}
		return fact ;
	}
}
