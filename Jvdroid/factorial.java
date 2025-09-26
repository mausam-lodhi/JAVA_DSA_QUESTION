import java.util.*;
public class Main {
	public static void main(String []args) {
		System.out.print("Enter the number : ");
		Scanner input = new Scanner(System.in);
		int fact = 1;
		int n = input.nextInt();
		for (int a = 1 ; a <= n ; n--) {
			fact = fact * n;
			if (n == 1)
				System.out.printf("factoriaal is %d", fact) ;
		}
	}
}
