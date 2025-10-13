public class printSubArrays {
    public static void printSubArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void printSubArray2(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = i; j < arr.length; j++) {
                str.append(arr[j] + " ");
                System.out.println(str);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        System.out.println("Program for printing the sub arrays ");
        int arr[] = { 2, 4, 6, 8, 10 };
        printSubArray2(arr);

    }
}
