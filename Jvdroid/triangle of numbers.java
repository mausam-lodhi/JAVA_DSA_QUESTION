
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter the number : ");
		int n = input.nextInt();
		for (int i = 1 ; i <= n; i++) {
			for (int j = 1 ; j <= i; j++) {
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}
}