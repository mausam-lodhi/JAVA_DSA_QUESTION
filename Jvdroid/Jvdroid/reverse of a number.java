import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a = sc.nextInt();
		while (a != 0) {
			int b = a % 10 ;
			a = a / 10 ;
			System.out.print(b);
		}
	}
}
