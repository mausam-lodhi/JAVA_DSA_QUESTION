import java.util.Scanner;

public class Factorial {
    public static int factorialFindByRecusion(int number) {
        if (number == 0)
            return 1;
        int factorial = number * factorialFindByRecusion(number - 1);
        return factorial;
    }

    public static int factorialFindByLoop(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println("factorial is : " + factorialFindByRecusion(number));
        System.out.println("factorial is : " + factorialFindByLoop(number));

    }
}
