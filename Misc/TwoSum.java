import java.util.HashMap;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<>(); // number -> index

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i]; // current number
            int y = target - x; // required number

            if (m.containsKey(y)) { // agar y pehle se map me hai
                return new int[] { m.get(y), i }; // uska index + current index
            }

            m.put(x, i); // current number ko map me daal do
        }

        return new int[] {}; // fallback
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 }, target = 9;
        System.out.println(twoSum(arr, target));
    }
}
