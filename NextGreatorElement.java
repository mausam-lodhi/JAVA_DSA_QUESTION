import java.util.Stack;

public class NextGreatorElement {

    public static int[] nextGreatorElement(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int result[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.empty() && stack.peek() >= arr[i]) {
                stack.pop();

            }
            if (stack.empty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
                stack.pop();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 8, 4 };

        int result[] = nextGreatorElement(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
