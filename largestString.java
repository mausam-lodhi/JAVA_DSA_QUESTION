public class largestString {
    public static String LargestString(String str[]) {
        String largest = "";
        for (int i = 0; i < str.length; i++) {
            if ((largest.compareTo(str[i])) < 0) {
                largest = str[i];
            }

        }
        return largest;
    }

    public static void main(String[] args) {
        String str[] = { "mausam", "aadi", "rahul", "zebra" };
        System.out.println(LargestString(str));

    }
}
