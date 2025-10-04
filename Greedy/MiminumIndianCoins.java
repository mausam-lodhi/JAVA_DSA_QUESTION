import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MiminumIndianCoins {

    // It is used just for the canonical system currencies
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer indianCurrencySystem[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000, 2000 };
        System.out.print("Enter the number of which you want the change  : ");
        int money = input.nextInt();

        Arrays.sort(indianCurrencySystem, Comparator.reverseOrder());
        for (int i = 0; i < indianCurrencySystem.length; i++) {
            System.out.print(indianCurrencySystem[i] + " ");
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < indianCurrencySystem.length; i++) {
            if (indianCurrencySystem[i] <= money) {
                while (indianCurrencySystem[i] <= money) {
                    count += 1;
                    System.out.println("notes are  " + indianCurrencySystem[i]);
                    money = money - indianCurrencySystem[i];
                }
            }
        }
        System.out.print("The notes or the coins you must required are " + count);
        input.close();
    }
}
