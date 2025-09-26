public class SubArrays {

    public static void printingSubarrays(int arr[]) {
        for (int start = 0; start < arr.length; start++) {
            for (int j = start; j < arr.length; j++) {
                for (int i = start; i <= j; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        printingSubarrays(arr);

    }
}
