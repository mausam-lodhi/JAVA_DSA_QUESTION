public class StringPalindrome {

    public static boolean isPalindrome(String s) {

        int lengthOfString = s.length();
        System.out.println(lengthOfString);
        for (int i = 0; i < lengthOfString / 2; i++) {
            if (s.charAt(i) != s.charAt(lengthOfString - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String result = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        System.out.println(isPalindrome(result));
    };

}
