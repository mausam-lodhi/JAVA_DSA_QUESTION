public class ContainersWithMostWater {
    public static void containersWithMostWater(int arr[]) {
        int area = 0;
        int length = 0;
        int bredth = 0;
        int first = 0, second = 0;
        int maximumArea = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                length = j - i;
                bredth = Math.min(arr[j], arr[i]);
                area = length * bredth;
                if (maximumArea < area) {
                    maximumArea = area;
                    first = arr[i];
                    second = arr[j];
                }
            }
        }
        System.out
                .print(" Maximum area is :  " + maximumArea + " " + " first is : " + first + " second is  : " + second);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        containersWithMostWater(arr);

    }
}
