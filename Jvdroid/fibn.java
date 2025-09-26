import java.util.*;
public class fibn {
	public static int fibn(int n) {
		if (n == 0)
			return 0 ;
		else if (n == 1)
			return 1 ;
		else
			return (fibn(n - 1) + fibn(n - 2));
	}
	public static void main(String[] args) {
		int a, num;
		System.out.println("Enter how many numbers u wmt : ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		for (int i = 0 ; i < a ; i ++) {
			num = fibn(i);
			System.out.println("  " + num);
		}
	}
}