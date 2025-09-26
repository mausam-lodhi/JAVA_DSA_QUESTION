import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthChainsOfPairs {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(pairs, Comparator.comparingDouble(index -> index[1]));
        ArrayList<Integer> list = new ArrayList<>();
        int lastEndingValue = pairs[0][1];
        list.add(0);
        int count = 1;

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > lastEndingValue) {
                count++;
                lastEndingValue = pairs[i][1];
            }
        }
        System.out.println(count);
    }
}
