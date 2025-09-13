import java.util.Scanner;

public class first {
    public static void arrayChange(int arr[], int size) {
        size = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Arrays Program : ");
        System.out.print("Enter the length of the arrya you want  : ");
        int size = input.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + i + "th number : ");
            arr[i] = input.nextInt();
        }
        arrayChange(arr, size);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(size);
    }

}