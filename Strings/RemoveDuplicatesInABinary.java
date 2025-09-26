public class RemoveDuplicatesInABinary {

    public static String removeDuplicates(String str) {
        int i = 0;
        String newString = "";
        while (i < str.length()) {
            if (i == str.length() - 1) {
                newString = newString + str.charAt(i);
                i++;
                return newString;
            }
            if (str.charAt(i) == str.charAt(i + 1)) {
                if (str.charAt(i) == '1') {
                } else {
                    newString = newString + str.charAt(i);
                }
            } else
                newString = newString + str.charAt(i);
            i++;
        }
        return newString;
    }

    public static void main(String[] args) {
        String str = "1110010111100";
        System.out.print(removeDuplicates(str));

    }
}
