public class LastOccurance {

    public static int firstOccurance(int arr[], int i, int n) {
        if (i < arr.length) {

            if (arr[i] == n) {
                return i;

            } else
                return firstOccurance(arr, i - 1, n);
        } else
            return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 3, 4, 5 };
        int i = arr.length - 1;
        System.out.print("On the index as : " + firstOccurance(arr, i, 5));
    }
}
