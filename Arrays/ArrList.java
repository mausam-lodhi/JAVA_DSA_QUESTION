import java.util.*;

public class ArrList {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {

        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(7);
        // System.out.println(list);
        // swap(list, 1, 2);
        // System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
