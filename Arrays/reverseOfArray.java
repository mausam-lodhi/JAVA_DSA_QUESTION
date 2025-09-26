import java.util.Scanner;

public class reverseOfArray {
    public static void reverse(int arr[]) {
        int temp = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int m = input.nextInt();
        int arr[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = input.nextInt();
        }
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
