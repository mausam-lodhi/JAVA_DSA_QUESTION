import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string :");
		String name = input.next();
		palindrome(name);
	}
	public static void palindrome(String a) {
		int size = a.length();
		int count = 0 ;
		int lastIndex = size - 1 ;
		for (int i = 0 ; i < a.length(); i++) {
			if (a.charAt(i) != a.charAt(lastIndex - i)) {
				count ++ ;
			}
		}
		if (count > 0)
			System.out.print("Not a palindrome ");
		else
			System.out.print("Palindrome ");
	}
}