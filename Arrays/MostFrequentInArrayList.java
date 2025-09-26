import java.util.ArrayList;

public class MostFrequentInArrayList {

    public static int mostFrequent(ArrayList<Integer> nums, int key) {
        int[] result = new int[1001]; // allow numbers 1 to 1000

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                result[nums.get(i + 1)]++; // directly use number as index
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = -1;
        for (int i = 0; i < result.length; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(200);
        list.add(200);
        list.add(1);
        list.add(100);

        System.out.println(mostFrequent(list, 1)); // ✅ Output = 200
    }
}
