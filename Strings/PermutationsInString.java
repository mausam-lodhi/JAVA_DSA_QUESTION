public class PermutationsInString {
    public static void findPermutations(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        } else
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                String remainingString = str.substring(0, i) + str.substring(i + 1);

                findPermutations(remainingString, ans + ch);
            }
    }

    public static void main(String[] args) {
        String str = "abcdef";
        findPermutations(str, "");
    }
}
