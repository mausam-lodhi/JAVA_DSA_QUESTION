import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter the no : ");
		int n = input.nextInt();
		range(n);
	}
	public static void range(int n) {
		for (int i = 2 ; i <= n ; i ++) {
			if (prime(i)) {
				System.out.print(i);
				System.out.print(",");
			}
		}
	}
	public static boolean prime(int n) {
		int count = 0;
		for (int i = 2 ; i <= n / 2 ; i ++) {
			if (n % i == 0)
				count ++ ;
		}
		if (count == 0)
			return true ;
		else
			return false ;
	}
}