import java.util.Scanner;

public class PrintXPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();

        // for (int i = 1; i <= number; i++) {
        // for (int j = 1; j <= number; j++) {
        // if (i == 1 || i == number || j == 1 || j == number || i == j || i + j ==
        // number + 1) {
        // System.out.print("* ");
        // } else
        // System.out.print(" ");

        // }
        // System.out.println();

        // }
        int c1 = 2, c2 = 2;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(Math.max(Math.abs(c1 - (i - 1)), Math.abs(c2 - (j - 1))) + "  ");

            }
            System.out.println();
        }
    }
}