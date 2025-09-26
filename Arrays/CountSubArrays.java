import java.util.HashMap;

public class CountSubArrays {

    public static int countSubArrays(int arr[], int target) {
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (map.containsKey(sum - target)) {
                count += map.get(sum - target);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(map);
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 2, 1, 2, 7, 8, 9, 10 };
        int target = 3;
        System.out.println(countSubArrays(arr, target));
    }
}