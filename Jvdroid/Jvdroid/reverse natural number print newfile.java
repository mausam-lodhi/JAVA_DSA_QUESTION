import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the number : ");
		int a = input.nextInt();
		for (int x = 0 ; a >= x; a--)
		System.out.println(a);

	}
}