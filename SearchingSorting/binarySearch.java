public class binarySearch {

    public static void Bsearch(int arr[], int key) {
        boolean isFound = false;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                isFound = true;
                break;
            } else if (arr[mid] > key)
                start = mid + 1;
            else
                end = mid - 1;
        }
        System.out.print(isFound);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 9, 10 };
        Bsearch(arr, 8);

    }
}
