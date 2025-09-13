
// import java.util.*;
import java.util.Stack;

public class StackByCollectionFramework {

    public static Stack<String> pushAtBottom(Stack<String> s, String data) {
        if (s.empty()) {
            s.push(data);
            return s;
        }

        String top = s.pop();
        pushAtBottom(s, data);
        s.add(top);

        return s;

    }

    public static String reverseStringByStack(Stack<String> s) {
        if (s.empty()) {
            return "";
        }
        String ch = s.pop(); // top nikaalo
        String newstr = reverseStringByStack(s); // baki ka reverse
        return newstr + ch; // aage join karo (ulta banega)
    }

    public static Stack<String> reverseStackByAnotherStack(Stack<String> s) {
        Stack<String> str = new Stack<>();
        if (s.empty()) {
            return s;
        }
        while (!s.empty()) {
            str.push(s.pop());
        }
        return str;

    }

    public static Stack<String> reverseStack(Stack<String> s) {

        if (s.isEmpty()) {
            return s;
        }

        String str = s.pop();
        s = reverseStack(s);
        return pushAtBottom(s, str);

    }

    public static void main(String[] args) {
        StackByCollectionFramework s1 = new StackByCollectionFramework();
        Stack<String> s = new Stack<>();
        String str = "";
        s.push("a");
        s.push("b");
        s.push("c");
        s.push("d");
        System.out.println(s);
        System.out.println(s1.reverseStack(s));

        // System.out.println(s1.pushAtBottom(s, "e"));
        // System.out.println("String is : " + s1.reverseStringByStack(s));
        // System.out.println(s);

    }
}