import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;
        double capacity = w;
        double value = 0;

        double comparator[][] = new double[val.length][4];

        for (int i = 0; i < comparator.length; i++) {
            comparator[i][0] = i;
            comparator[i][1] = val[i];
            comparator[i][2] = weight[i];
            comparator[i][3] = val[i] / weight[i];
        }

        Arrays.sort(comparator, Comparator.comparingDouble(o -> comparator[0][3]));
        // for (int i = 0; i < comparator.length; i++) {
        // for (int j = 0; j < comparator[0].length; j++) {
        // System.out.print(comparator[i][j] + " ");
        // }
        // System.out.println();
        // }
        for (int i = 0; i < comparator.length; i++) {
            if (capacity >= comparator[i][2]) {
                value = value + comparator[i][1];
                capacity = capacity - comparator[i][2];
            } else {
                value = value + capacity * comparator[i][3];
                capacity = 0;
            }
        }
        System.out.println((int) (value));
    }
}
