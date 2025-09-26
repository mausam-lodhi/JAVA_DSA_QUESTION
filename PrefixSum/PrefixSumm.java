import java.util.ArrayList;
import java.util.List;

public class PrefixSumm {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 5, 15 };
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            list.add(list.get(i - 1) + arr[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
