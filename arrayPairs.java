import java.util.Scanner;

public class arrayPairs {

    public static void arrayPair(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j = 0 + i; j < arr.length; j++) {
                if (j - i != arr.length)
                    if (i != j)
                        System.out.print("(" + current + "," + arr[j] + ")");

            }
            System.err.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int number = scanner.nextInt();
        int arr[] = new int[number];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < number; i++) {
            arr[i] = scanner.nextInt();
        }
        System.err.println();
        arrayPair(arr);
    }
}
