import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0 ;
		System.out.print(" Enter the number : ");
		int a = input.nextInt();
		for (int x = 0 ; x <= a; a--)
			sum = sum + a ;
		System.out.printf("Summation is %d", sum);

	}
}