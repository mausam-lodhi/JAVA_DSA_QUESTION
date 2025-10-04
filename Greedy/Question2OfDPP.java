/* Question 2:
Kth largest odd number in a given range
We have two variables L and R, indicating a range of integers from L to R inclusive, and a number K, the task is to find Kth largest odd number. If K > number of odd numbers in the range L to R then return 0.
Sample Input 1: L = -3, R= 3, K = 1
Sample Output 1:3 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Question2OfDPP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the L : ");
        int left = input.nextInt();

        System.out.print("Enter the R : ");
        int right = input.nextInt();

        System.out.print("Enter the kth element : ");
        int k = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i % 2 != 0) {
                list.add(i);
            }
        }
        if (k > list.size()) {
            System.out.print("The element doesnt exist");
            return;
        }

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("The " + k + "th element is : " + list.get(k - 1));

    }
}
