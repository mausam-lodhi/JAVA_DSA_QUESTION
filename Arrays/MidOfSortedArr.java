class MidOfSortedArr {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int newArr[] = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                newArr[k] = nums2[j];
                j++;
                k++;

            } else {
                newArr[k] = nums1[i];
                i++;
                k++;
            }
        }
        while (i < nums1.length) {
            newArr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            newArr[k] = nums2[j];
            j++;
            k++;
        }
        int middle = newArr.length / 2;
        if (newArr.length % 2 == 0) {
            return newArr[middle] + newArr[middle + 1];
        }
        return newArr[middle];
    }

    public static void main(String[] args) {
        int num1[] = { 0, 0, 0, 0, 0 };
        int num2[] = { -1, 0, 0, 0, 0, 0, 1 };

        System.out.println(findMedianSortedArrays(num1, num2));
    }
}