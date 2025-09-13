import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		age();
		name();
	}

	public static void age() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int a = input.nextInt();
		System.out.println("Age is : " + a);
	}

	public static void name() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String a = input.nextLine();
		System.out.println(" Name is  : " + a);
	}
}