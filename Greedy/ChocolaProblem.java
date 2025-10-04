import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {

    public static void main(String[] args) {
        int m = 4, n = 6;
        Integer CostVer[] = { 2, 1, 3, 1, 4 };
        Integer CostHor[] = { 4, 1, 2 };

        Arrays.sort(CostVer, Collections.reverseOrder());
        Arrays.sort(CostHor, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < CostHor.length && v < CostVer.length) {
            if (CostVer[v] <= CostHor[h]) { // horizontal cut
                cost = cost + (CostHor[h] * vp);
                hp++;
                h++;
            } else {
                cost = cost + (CostVer[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < CostHor.length) {
            cost = cost + (CostHor[h] * vp);
            hp++;
            h++;
        }
        while (v < CostVer.length) {
            cost = cost + (CostVer[v] * hp);
            vp++;
            v++;
        }

        System.out.print("The minimum cost to cut the chocola bar is : " + cost);
    }
}