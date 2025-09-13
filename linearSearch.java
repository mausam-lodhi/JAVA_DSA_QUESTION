public class linearSearch {

    public static boolean lSearch(int arr[], int key) {
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                isFound = true;
            }
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int key = 7;
        System.out.println(lSearch(arr, key));

    }
}
