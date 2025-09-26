import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = input.nextInt();
	int	m = n % 2 ;
		switch (m) {
		case 1 :
			System.out.println("odd");
			break;
		case 0 :
			System.out.println("Even");
			break;
		}
	}
}