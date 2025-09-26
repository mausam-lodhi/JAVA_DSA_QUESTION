import java.util.*;

public class fibonacci {

    public static int sumOfNumber(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int total = sumOfNumber(n - 2) + sumOfNumber(n - 1);
        // System.out.println(total);
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number  ; ");
        int n = input.nextInt();
        System.err.print("Sum is " + sumOfNumber(n));
    }
}
