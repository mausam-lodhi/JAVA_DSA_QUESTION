import java.util.Scanner;

public class ConcentricReactangularPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        int size = number * 2 - 1;
        int start = 0;
        int end = size - 1;
        int arr[][] = new int[size][size];

        // time complexity for this o^3 and the space time complexity is o^2
        // while (number > -1) {
        // for (int i = start; i <= end; i++) {
        // for (int j = start; j <= end; j++) {
        // if (i == start || i == end || j == start || j == end) {
        // arr[i][j] = number;
        // }
        // }
        // }
        // start++;
        // end--;
        // number--;
        // }
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // time complexity for this o^2 and the space time complexity is o(1)

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int top = i;
                int left = j;
                int right = size - j - 1;
                int bottom = size - i - 1;
                System.out.print(number - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }
            System.out.println();
        }
    }
}