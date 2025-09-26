import java.util.Scanner;

public class BinaryNumberUptoN {
    public static int binaryNumberUptoN(int number) {
        StringBuilder str = new StringBuilder();

        while (number > 0) {
            str.append(number % 2);
            number = number / 2;
        }
        return Integer.parseInt(str.reverse().toString());

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(binaryNumberUptoN(i) + " ");
        }
        input.close();
    }
}
