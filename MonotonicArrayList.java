import java.util.ArrayList;

public class MonotonicArrayList {
    public static boolean monotonic(ArrayList<Integer> list) {
        if (list.get(0) > list.get(1)) {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) <= list.get(i + 1)) {
                    return false;
                }
            }
        }
        if (list.get(0) < list.get(1)) {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) >= list.get(i + 1)) {
                    return false;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.println(monotonic(list));

    }
}
