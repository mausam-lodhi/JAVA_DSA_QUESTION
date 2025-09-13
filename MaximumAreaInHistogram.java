import java.util.Stack;

public class MaximumAreaInHistogram {

    public static int[] nse(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int result[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = arr.length;
            } else {
                result[i] = stack.peek();

            }
            stack.push(i);
        }
        return result;
    }

    public static int[] pse(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int result[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        return result;
    }

    public static int maximumAreaInHistogram(int arr[]) {
        int pse[] = pse(arr);
        int nse[] = nse(arr);

        int Area = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int length = arr[i];
            if (pse[i] == -1) {
                pse[i] = arr.length;
            }
            int breadth = (nse[i] - pse[i] - 1);

            int newArea = length * breadth;
            Area = Math.max(newArea, Area);

        }
        return Area;

    }

    public static void main(String[] args) {
        int heights[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(maximumAreaInHistogram(heights));
    }
}
