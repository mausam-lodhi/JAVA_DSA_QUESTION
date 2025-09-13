public class TrappingRainwater {

    public static int maxWaterByLoops(int arr[]) {
        int totalWater = 0;
        for (int i = 1; i < arr.length - 1; i++) {// max left
            int maxLeft = arr[i];
            int maxRight = arr[i];
            for (int j = i; j >= 0; j--) {
                if (maxLeft < arr[j]) {
                    maxLeft = arr[j];
                }
            }
            for (int j = i; j < arr.length; j++) { // max right
                if (maxRight < arr[j]) {
                    maxRight = arr[j];
                }
            }
            int water = Math.min(maxRight, maxLeft) - arr[i];
            totalWater = water + totalWater;

        }
        return totalWater;
    }

    public static int maxWater(int arr[]) {
        int length = arr.length;

        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (leftMax) {

            }
        }

    }

    public static void main(String[] args) {
        int heights[] = { 7, 0, 4, 2, 5, 0, 6, 4, 0, 5, 0, 1 };
        System.out.println(maxWaterByLoops(heights));
    }
}
