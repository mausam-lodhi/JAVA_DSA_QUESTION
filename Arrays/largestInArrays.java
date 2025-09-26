public class largestInArrays {

    public static void largestinArrays(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i])
                largest = arr[i];

        }
        System.out.print("largest is : " + largest);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 9, 5, 0, 8 };
        largestinArrays(arr);

    }
}
