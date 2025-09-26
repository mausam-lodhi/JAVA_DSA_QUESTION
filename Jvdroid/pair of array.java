import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = {2, 4, 6, 8, 10, 12, 14, 16};
		int i, j ;
		for (i = 0 ; i < 8; i ++) {
			for (j = i + 1; j < 8 ; j ++) {
				System.out.print("(" + array[i] + " ,");
				System.out.print(array[j] + ")");
			}

			System.out.println();
		}
	}
}