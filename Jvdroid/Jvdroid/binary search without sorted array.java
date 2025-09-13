import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = input.nextInt();
		int start = 0 ;
		int end = size  ;
		System.out.print("Enter the elements in sorted form ");
		int array[] = new int [size];
		for (int i = 0 ; i < size ; i++) {
			array[i] = input.nextInt();
		}
		Arrays.sort(array);
		System.out.println("You entered the elements are : ");
		for (int i = 0 ; i < size ; i++) {
			System.out.println(array[i]);
		}
		System.out.print("Enter the elements what you want to search : ");
		int key = input.nextInt();
		while (start <= end) {
			int mid = (start + end) / 2 ;
			if (key == array[mid]) {
				System.out.printf("We found it on the index %d", mid);
				break;
			} else if (key < array[mid]) {
				end = mid - 1 ;
			} else
				start = mid + 1 ;
		}
	}
}