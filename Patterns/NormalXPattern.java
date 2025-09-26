import java.util.Scanner;

public class NormalXPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i == j || i + j == number + 1) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j <= number; j++) {
                if (i <= j || i + j == number) {
                    System.out.print("* ");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i == j || i + j == number + 1 || i == number / 2 + 1 || j == number / 2 + 1) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
