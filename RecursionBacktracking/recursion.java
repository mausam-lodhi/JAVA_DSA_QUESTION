import java.util.Scanner;

public class Recursion {
    public static int sumOfNumber(int n) {
        if (n == 1) {
            return 1;
        }
        int total = n + sumOfNumber(n - 1);
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number  ; ");
        int n = input.nextInt();
        System.err.print(sumOfNumber(n));
    }
}
