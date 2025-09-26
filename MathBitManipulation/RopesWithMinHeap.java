import java.util.PriorityQueue;

public class RopesWithMinHeap {
    public static PriorityQueue<Integer> queue = new PriorityQueue<>();

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }
        // while (!queue.isEmpty()) {
        // System.out.println(queue.remove());
        // }

        int totalCost = 0;
        while (queue.size() > 1) {
            int first = queue.remove();
            int second = queue.remove();
            totalCost = first + second + totalCost;
            queue.add(first + second);
        }
        System.out.println(totalCost);
    }
}
