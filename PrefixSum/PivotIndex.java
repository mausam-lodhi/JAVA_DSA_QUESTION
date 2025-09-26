import java.util.ArrayList;
import java.util.List;

public class PivotIndex {

    public static int pivotIndex(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (total - sum(i, nums) - nums[i] == sum(i, nums)) {
                return i;
            }
        }
        return -1;
    }

    public static int sum(int index, int nums[]) {
        int total = 0;
        for (int i = 0; i < index; i++) {
            total = total + nums[i];
        }
        return total;
    }

    public static int pivotIndexBySimple(int nums[]) {
        int total = 0;
        for (int i : nums) {
            total += i;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (total - leftSum - nums[i] == leftSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 7, 3, 6, 5, 6 };
        // System.out.print(pivotIndex(nums));
        System.out.print(pivotIndexBySimple(nums));

    }

}
