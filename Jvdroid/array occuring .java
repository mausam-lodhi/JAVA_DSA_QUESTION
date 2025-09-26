import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int a = input.nextInt();
		System.out.print("Enter the elements : \n");
		int array[] = new int[a];
		for (int i = 0 ; i < array.length ; i ++)
			array[i] = input.nextInt();
		System.out.println("You entered elements are : ");
		for (int i = 0 ; i < array.length ; i ++)
			System.out.println(array[i]);
		System.out.print("Enter the element what you want to search (that how many times it is ) : ");
		int count = 0 ;
		int num = input.nextInt();
		for (int i = 0 ; i < array.length ; i ++) {
			if (array[i] == num)
				count ++;
		}
		System.out.println(num + " occurs " + count + " times ");

	}
}