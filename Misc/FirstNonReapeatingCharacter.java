import java.util.LinkedList;
import java.util.Queue;

public class FirstNonReapeatingCharacter {

    public static void firstNonRepeatingCharacter(String str) {
        Queue<Character> queue = new LinkedList<>();
        int freq[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.add(ch);
            freq[ch - 'a']++;

            while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
                queue.remove();
            }
            if (queue.isEmpty()) {
                System.out.print(-1 + " ");
            } else
                System.out.print(queue.peek() + " ");
        }
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        firstNonRepeatingCharacter(str);
    }
}
