public class MergeSort {

    public static void mergeSorting(int arr[], int si, int ei) {
        if (si == ei) {
            return;
        }
        int mid = (si + ei) / 2;

        mergeSorting(arr, si, mid);
        mergeSorting(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // Left subarray pointer
        int j = mid + 1; // Right subarray pointer
        int k = 0; // Temp array pointer

        // Merge both halves
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy back to original array
        for (int m = 0; m < temp.length; m++) {
            arr[si + m] = temp[m];
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 1, 4, 2, 2 };
        mergeSorting(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
