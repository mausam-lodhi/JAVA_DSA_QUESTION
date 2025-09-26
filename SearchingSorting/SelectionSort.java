public class SelectionSort {

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minPose = i;
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[minPose] > arr[j]) {
                    minPose = j;
                }
            }
            int temp = arr[minPose];
            arr[minPose] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 1, 2, 5, 4 };
        selectionSort(arr);

    }
}
