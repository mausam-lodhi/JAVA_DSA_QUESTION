import java.util.Scanner;

public class KthLargestOddOptimized {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter L: ");
        int L = input.nextInt();

        System.out.print("Enter R: ");
        int R = input.nextInt();

        System.out.print("Enter K: ");
        int K = input.nextInt();

        // Find the largest odd number in the range
        int largestOdd = (R % 2 != 0) ? R : R - 1;

        // Calculate Kth largest odd number
        int kthLargest = largestOdd - 2 * (K - 1);

        // Check if it is within the range
        if (kthLargest < L) {
            System.out.println("The element doesn't exist");
        } else {
            System.out.println("The " + K + "th largest odd number is: " + kthLargest);
        }

        input.close();
    }
}
