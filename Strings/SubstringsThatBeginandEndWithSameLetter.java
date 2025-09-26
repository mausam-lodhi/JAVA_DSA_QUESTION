public class SubstringsThatBeginandEndWithSameLetter {

    public static int countSubString(String str) {
        int ans = str.length();

        int frq[] = new int[26];
        for (char ch : str.toCharArray()) {
            frq[ch - 'a']++;
        }
        for (int i = 0; i < frq.length; i++) {
            if (frq[i] > 1) {
                ans = ans + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "mausamlodhi";
        System.out.println(countSubString(str));
    }
}
