import java.util.*;

public class SumIn2DArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = input.nextInt();
		int i = 0, j = 0;
		System.out.print("Enter the elements :  ");
		int array[][] = new int[size][size];
		for (i = 0; i < size; i++)
			for (j = 0; j < size; j++) {
				array[i][j] = input.nextInt();
			}
		for (i = 0; i < size; i++) {
			int sum = 0;
			for (j = 0; j < size; j++)
				sum = sum + array[j][i];
			System.out.printf("Sum of %d column  is %d \n", i, sum);
		}
	}
}