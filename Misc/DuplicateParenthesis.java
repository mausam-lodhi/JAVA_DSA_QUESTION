import java.util.Stack;

public class DuplicateParenthesis {
    public static boolean isDuplicateParenthesis(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count <= 0) {
                    return true;
                }
            } else
                s.push(str.charAt(i));
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "(a+b)";
        System.out.println(isDuplicateParenthesis(str));
    }
}
