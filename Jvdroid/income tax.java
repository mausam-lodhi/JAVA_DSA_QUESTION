import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your income in lacks : ");
		Float income = input.nextFloat();
		Float tax = 0f ;
		if (income < 500000) {
			System.out.println("Your tax is : "  + tax);
		} else if (income >= 500000 && income < 1000000) {
			tax = income * 20 / 100;
			System.out.println("Your tax is : " + tax);
		} else if (income > 1000000) {
			tax = income * 30 / 100;
			System.out.println("Your tax is : " + tax);
		}
	}
}