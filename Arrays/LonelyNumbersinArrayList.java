import java.util.ArrayList;

public class LonelyNumbersinArrayList {

    public static void lonelyNumbersinArrayList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int j = 0;
            while (list.size() - 1 >= j) {
                if (i != j) {
                    if (list.get(i) == list.get(j) + 1 || list.get(i) == list.get(j) - 1
                            || list.get(i) == list.get(j)) {
                        System.out.println(list.get(i));
                    }
                }
                j++;
            }

        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        lonelyNumbersinArrayList(list);
    }
}
