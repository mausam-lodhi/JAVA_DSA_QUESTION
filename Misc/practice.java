import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Practice {
    // code for reversing a queue upto the given numbers
    // public static void queueReverse(Deque<Integer> queue, int index) {
    // Queue<Integer> queue2 = new LinkedList<>();
    // for (int i = 0; i < index; i++) {
    // queue2.add(queue.removeFirst());
    // }
    // while (!queue2.isEmpty()) {
    // queue.addFirst(queue2.remove());
    // }
    // }

    // public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);
    // System.out.println("Enter the number : ");
    // int number = input.nextInt();
    // Deque<Integer> queue = new LinkedList<>();
    // queue.addLast(10);
    // queue.addLast(20);
    // queue.addLast(30);
    // queue.addLast(40);
    // queue.addLast(50);
    // queue.addLast(60);
    // queue.addLast(70);
    // queue.addLast(80);
    // queue.addLast(90);
    // queue.addLast(100);
    // queueReverse(queue, number);
    // while (!queue.isEmpty()) {
    // System.out.println(queue.remove());
    // }
    // input.close();
    // }

    // code for Maximum of all subarrays of size k

    // public static void maximumInFirstK(int arr[], int k) {
    // for (int i = 0; i < arr.length - 2; i++) {
    // int max = Integer.MIN_VALUE;
    // for (int j = i; j < k + i; j++) {
    // if (max < arr[j]) {
    // max = arr[j];
    // }
    // }
    // System.out.print(max + " ");
    // }
    // }

    // public static void main(String[] args) {
    // int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
    // int k = 3;
    // maximumInFirstK(arr, k);

    // }

    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }
}