import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // for (int k = j + 1; k < nums.length; k++) {
        // if (i != j && i != k && j != k && nums[i] + nums[j] + nums[k] == 0) {
        // {

        // matrix.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
        // }

        // }

        // }
        // }
        // }
        // Set<List<Integer>> set = new LinkedHashSet<>(matrix);

        // return new ArrayList<>(set);

        List<List<Integer>> matrix = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    matrix.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else
                    right--;
            }

        }
        return matrix;

    }

    public static void main(String[] args) {
        int nums[] = { 1, -1, -1, 0 };
        System.out.println(threeSum(nums));

    }

}
