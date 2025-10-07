import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int result[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.empty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.empty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 8, 4 };

        int result[] = nextGreaterElement(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
