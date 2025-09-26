import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static int longestSubstring(String str) {
        int i = 0, j = 0, maxLen = 0;
        Set<Character> s = new HashSet<>();
        while (j < str.length()) {
            char ch = str.charAt(j);
            while (s.contains(ch)) {
                s.remove(str.charAt(i));
                i++;
            }
            s.add(ch);
            maxLen = Math.max(maxLen, j - i + 1);
            j++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String str = "pwwkey";
        System.out.println(longestSubstring(str));
    }
}
