import java.util.*;
public class TwoArray {
    public static void main(String args[]){
        System.out.print("Enter the size of an array you want : ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int n[][] = new int[size][size];
        int inputs = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                n[i][j] = input.nextInt();
                inputs++;

            }

        }
        System.out.println(inputs);
         for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(n[i][j]);
            }

        }
    }
}
