import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionWithSorting {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        int arr[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            arr[i][0] = i;
            arr[i][1] = start[i];
            arr[i][2] = end[i];
        }

        Arrays.sort(arr, Comparator.comparingDouble(o -> o[2]));
        ArrayList<Integer> list = new ArrayList<>();
        int endLast = arr[0][2];
        list.add(arr[0][0]);
        int maxAct = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][1] > endLast) {
                maxAct++;
                list.add(arr[i][0]);
                endLast = arr[i][2];
            }
        }
        System.out.println("Max Activities : " + maxAct);
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j) + "A  ");
        }
        System.out.println();
    }
}
