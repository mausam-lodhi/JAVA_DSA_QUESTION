import java.util.Scanner;

public class PrimeWithFactors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a = input.nextInt();
		int count = 1;
		for (int b = 2; b < a / 2; b++) {
			if (a % b == 0)
				count++;
		}
		if (count == 1)
			System.out.print("Prime number ");
		else
			for (int x = 1; x <= a; x++)
				if (a % x == 0)
					System.out.printf("facter is %d \n", x);

	}
}