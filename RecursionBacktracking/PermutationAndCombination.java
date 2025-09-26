import java.util.*;

public class PermutationAndCombination {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the value of n  : ");
		long n = input.nextInt();

		System.out.print("Enter the value of r  : ");
		long r = input.nextInt();

		long fact1 = fact(n);
		long fact2 = fact(r);
		long fact3 = fact(n - r);

		System.out.println("n! = " + fact1);
		System.out.println("r!= " + fact2);
		System.out.println("n-r!= " + fact3);

		long ncr = (fact1) / (fact2 * fact3);
		System.out.println("ncr= : " + ncr);

		long npr = (fact1) / fact3;
		System.out.println("npr= : " + npr);
	}

	public static long fact(long a) {
		long fact = 1;
		for (int i = 1; i <= a; a--) {
			fact = fact * a;
		}
		return fact;
	}
}
