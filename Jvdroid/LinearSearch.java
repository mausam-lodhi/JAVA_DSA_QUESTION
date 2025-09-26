import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		System.out.print("Enter the size of array : ");
		int size = input.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the values of an array : ");
		for (i = 0 ; i < size ; i++) {
			array[i] = input.nextInt();
		}
		System.out.print("You have entered  : ");
		for (i = 0 ; i < size ; i++) {
			System.out.println(array[i]);
		}
		System.out.print("Do you want to search something in array \nIf yes then give  1 or 0 for no : ");
		int a = input.nextInt();
		if (a == 1) {
			System.out.print("\nWhat you want to search from an array : ");
			int x = input.nextInt();
			for (i = 0; i < array.length; i++) {
				if (x == array[i])
					System.out.printf("We have found the element %d on index %d", x, i);
			}
		} else
			System.out.print("Element is not present in aaray");
	}
}