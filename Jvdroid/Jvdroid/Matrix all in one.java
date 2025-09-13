import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, j, k, sum = 0;
		System.out.print("Enter the size  : ");
		int size = input.nextInt();
		if (size > 0) {
			int mat[][] = new int[size][size];
			int mat2[][] = new int[size][size];
			int trans [][] = new int [size][size];
			int trans2 [][] = new int [size][size];
			int trans3[][] = new int [size][size];
			System.out.printf("Enter the %d-D matrix [A]------- \n", size);
			for (i = 0 ; i < size ; i ++) {
				for (j = 0 ; j < size ; j++) {
					System.out.printf("Enter the element of %d ka %d : ", i, j);
					mat[i][j] = input.nextInt();
				}
			}
			System.out.printf("\nYou have enter the %d-D matrix : \n elements are ____\n", size);
			for (i = 0 ; i < size ; i ++) {
				for (j = 0 ; j < size ; j++) {
					System.out.printf("Element of %d ka %d : ", i, j);
					System.out.print(mat[i][j] + "\n");
				}
			}
			System.out.print("Multiplication krna h : \n Agar hn toh 1 or na toh 0 : ");
			int a = input.nextInt();
			if (a == 1) {
				System.out.printf("Enter the %d-D matrix for multiplication[B] ------- \n", size);
				for (i = 0 ; i < size ; i ++) {
					for (j = 0 ; j < size ; j++) {
						System.out.printf("Enter the element of %d ka %d : ", i, j);
						mat2[i][j] = input.nextInt();
					}
				}
			} else {
				return  ;
			}
			System.out.printf("\nYou have enter the %d-D matrix : \n elements are ____\n", size);
			for (i = 0 ; i < size ; i ++) {
				for (j = 0 ; j < size ; j++) {
					System.out.printf("Element of %d ka %d : ", i, j);
					System.out.print(mat2[i][j] + "\n");
				}
			}
			int multi[][] = new int[size][size];
			for (i = 0 ; i < size ; i ++) {
				for (j = 0 ; j < size ; j++) {
					for (k = 0 ; k < size ; k++) {
						sum = sum + mat[i][k] * mat2[k][j] ;
					}
					multi[i][j] = sum ;
					sum = 0 ;
				}
			}
			System.out.println("\n\nMultiplication of Matrix are ----- ");
			for (i = 0 ; i < size ; i ++) {
				for (j = 0 ; j < size ; j++) {
					System.out.printf("Element of %d ka %d : ", i, j);
					System.out.print(multi[i][j] + "\n");
				}
			}
			System.out.print("Transpose chahiye  , sabhi matrix ka ? \nAgar chahiye toh 1 or nhi toh 0 : ");
			int x = input.nextInt();
			if (x == 1) {
				for (i = 0 ; i < size ; i ++) {
					for (j = 0 ; j < size ; j++) {
						trans[i][j] = mat[j][i];
					}
				}
				for (i = 0 ; i < size ; i ++) {
					for (j = 0 ; j < size ; j++) {
						trans2[i][j] = mat2[j][i];
					}
				}
				for (i = 0 ; i < size ; i ++) {
					for (j = 0 ; j < size ; j++) {
						trans3[i][j] = multi[j][i];
					}
				}
			}
			for (i = 0 ; i < size ; i ++) {
				for (j = 0 ; j < size ; j++) {
					System.out.printf("Element of %d ka %d after transpose [A]: ", i, j);
					System.out.print(trans[i][j] + "\n");
				}
			}
			System.out.println("\n\n\n");
			for (i = 0 ; i < size ; i ++) {
				for (j = 0 ; j < size ; j++) {
					System.out.printf("Element of %d ka %d after transpose [B]: ", i, j);
					System.out.print(trans2[i][j] + "\n");
				}
			}
			System.out.println("\n\n\n");
			for (i = 0 ; i < size ; i ++) {
				for (j = 0 ; j < size ; j++) {
					System.out.printf("Element of %d ka %d after transpose [Multiply]: ", i, j);
					System.out.print(trans3[i][j] + "\n");
				}
			}

		} else
			return;
	}
}