import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                } else {
                    if (s.peek() == '(' && str.charAt(i) == ')' ||
                            s.peek() == '{' && str.charAt(i) == '}' ||
                            s.peek() == '[' && str.charAt(i) == ']') {
                        s.pop();
                    } else
                        return false;
                }
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("([)]"));
    }
}