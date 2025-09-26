import java.util.*;
public class Main {
	public static void main(String[] args) {
		int sum = 0 ;
		Scanner input = new Scanner(System.in);
		System.out.println("Kitne  numbers ka sum krna h  :  ");
		int a = input.nextInt();
		int n[] = new int [a];
		System.out.println("Enter the numbers  : ");
		for (int i = 0 ; i < a ; i ++) {
			n[i] = input.nextInt();
			sum = sum + n[i];
		}
		int avg = sum / a ;
		System.out.println("Summation is : " + sum);
		System.out.print("average is : " + avg);
	}
}