import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DecimalToBinary_Reversed {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int num = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        while (num > 0) {
            int remainder = num % 2;
            list.add(remainder);
            num = num / 2;
        }
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                list.set(i, 1);
            } else
                list.set(i, 0);
        }
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }

    }
}
