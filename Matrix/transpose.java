public class  transpose{
    public static void main(String[] args) {
        int nums[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int temp = 0;
        for (int i = 0; i <nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}