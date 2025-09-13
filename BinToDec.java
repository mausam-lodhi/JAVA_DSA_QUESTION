import java.util.*;

public class BinToDec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the no : ");
		int n = input.nextInt();
		convert(n);
	}

	public static void convert(int n) {
		int dec = 0;
		int pow1 = 0;
		while (n > 0) {
			int last = n % 10;
			dec = dec + last * (int) Math.pow(2, pow1);
			pow1++;
			n = n / 10;
		}
		System.out.print("decimal = " + dec);
	}
}