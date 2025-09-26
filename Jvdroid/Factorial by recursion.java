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
		if (a == 1)
			return 1 ;
		else
			return (a * fact(a - 1)) ;
	}
}