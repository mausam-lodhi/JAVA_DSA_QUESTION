import java.util.ArrayList;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        ArrayList<Integer> list = new ArrayList<>();
        int maxAct = 1;
        int endLast = end[0];
        list.add(0);
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= endLast) {
                list.add(i);
                maxAct++;
                endLast = end[i];
            }
        }
        System.out.println("Max Activities : " + maxAct);
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j) + 1 + "A  ");
        }
        System.out.println();
    }
}
