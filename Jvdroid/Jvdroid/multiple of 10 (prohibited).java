import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		while (true) {
			int n = sc.nextInt();
			if (n % 10 == 0)
				break ;
			sc.nextInt();
		}
	}
}