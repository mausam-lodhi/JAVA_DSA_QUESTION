public class TIlesProblem {
    public static int tilesFind(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = tilesFind(n - 1); // for horizontal
        int fnm2 = tilesFind(n - 2);// for vertical
        return fnm1 + fnm2;
    }

    public static void main(String[] args) {
        System.out.println(tilesFind(3));
    }
}
