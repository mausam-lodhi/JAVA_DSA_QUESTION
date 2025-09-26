import java.util.*;

public class ArrayMaxAndMIn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = 0;
		int num;
		System.out.print("kitne numbers  daalne hai ? ");
		num = input.nextInt();
		int m[] = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.printf("Enter %d number : ", i);
			m[i] = input.nextInt();
		}
		for (int i = 0; i < num; i++) {
			if (max > m[i])
				max = max;
			if (max < m[i])
				max = m[i];
		}
		int min = m[0];
		for (int i = 0; i < num; i++) {
			if (m[i] < min)
				min = m[i];
		}
		System.out.println("Maximum number is : " + max);
		System.out.println("Minimum  number is : " + min);
	}
}
