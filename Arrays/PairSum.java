public class PairSum {

    public static boolean pairSum1(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean pairSum2(int arr[], int target) {
        int lp = 0;
        int rp = arr.length - 1;
        while (lp < rp) {
            if (arr[lp] + arr[rp] == target) {
                return true;
            } else if (arr[lp] + arr[rp] > target) {
                rp--;
            } else
                lp++;
        }
        return false;
    }

    public static boolean pairSum3(int arr[], int target) {
        int rp = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                rp = i;
            }
        }
        int lp = rp + 1;

        while (lp != rp) {
            if (arr[lp] + arr[rp] == target) {
                return true;
            } else if (arr[lp] + arr[rp] > target) {
                rp = (rp - 1) % arr.length;
            } else {
                lp = (lp + 1) % arr.length;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 15, 6, 8, 9 };
        System.out.println(pairSum3(arr, 21));

    }
}
