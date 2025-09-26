public class RemoveDuplicatesInAString {
    public static String removeDuplicates(String str) {
        int i = 0;
        String newString = "";
        while (i < str.length()) {
            if (i == str.length() - 1) {
                newString = newString + str.charAt(i);
                return newString;
            }

            if (str.charAt(i) != str.charAt(i + 1)) {
                newString = newString + str.charAt(i);

            }
            i++;
        }
        return newString;
    }

    public static void main(String[] args) {
        String str = "mmausaamllodhiiii";
        System.out.print(removeDuplicates(str));
        // System.out.print(str + str.charAt(0));
    }
}