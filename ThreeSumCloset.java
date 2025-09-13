import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThreeSumCloset {
    public static int threeSumCloset(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                list.add(sum);
                left++;
                right--;
            }
        }
        Collections.sort(list);
        int closet = list.get(0);
        for (int num : list) {
            if (Math.abs(num - target) < Math.abs(closet - target)) {
                closet = num;
            }
        }
        return (int) closet;

    }

    public static void main(String[] args) {
        int nums[] = { 0, 0, 0 };
        System.out.println(threeSumCloset(nums, 1));

    }
}
