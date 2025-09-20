import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class uniqueOccurrences {

    public static boolean uniqueOccurrence(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (int values : map.values()) {
            set.add(values);
        }
        return set.size() == map.size();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 1, 1, 3 };
        System.out.println(uniqueOccurrence(arr));
    }
}