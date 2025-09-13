import java.util.*;

public class inbuiltSort {

    public static void main(String[] args) {
        Integer arr[] = { 1, 2, 4, 8, 9, 5, 6 };
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
