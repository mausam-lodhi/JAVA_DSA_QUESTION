import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		int sum, sub, multi;
		sum = sub = multi = 0;
		Float div = 0f;

		Scanner input = new Scanner(System.in);

		System.out.println(
				" Enter 1 for addion \n Enter 2 for Subtraction \n Enter 3 for Multiplication \n Enter 4 for division ");

		System.out.print("Enter number what you want to do :  ");
		int operater = input.nextInt();

		System.out.print("Enter the first  number :  ");
		int a = input.nextInt();

		System.out.print("Enter the second number number:  ");
		int b = input.nextInt();

		switch (operater) {

			case 1:
				sum = a + b;
				System.out.print("Addition of your numbers are : " + sum);
				break;

			case 2:
				sub = a - b;
				System.out.print("Subtraction of your numbers are : " + sub);
				break;

			case 3:
				multi = a * b;
				System.out.print("Multiplication of your numbers are : " + multi);
				break;

			case 4:
				div = (float) a / b;
				System.out.print("Division of your numbers are : " + div);
				break;

		}
	}
}