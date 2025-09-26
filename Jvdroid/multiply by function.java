import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the a : ");
		int a = input.nextInt();
		System.out.print("Enter the b : ");
		int b = input.nextInt();
		int c = multi(a, b);
		System.out.print("Multi = : " + c);
	}
	public static int multi(int a, int b) {
		return a * b;
	}
}