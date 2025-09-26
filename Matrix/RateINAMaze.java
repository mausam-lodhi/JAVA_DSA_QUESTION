public class RateINAMaze {

    public static int RateINAMazeSolver(int arr[][], int row, int col) {
        if (row == arr.length - 1 && col == arr.length - 1) {
            return 1;
        }
        if (row == 0 || col == 0) {
            return 0;
        }
        if (arr[row][col] == 1) {
            return
        }

        int w1 = RateINAMazeSolver(arr, row, col - 1);
        int w2 = RateINAMazeSolver(arr, row, col + 1);
        int w3 = RateINAMazeSolver(arr, row - 1, col);
        int w4 = RateINAMazeSolver(arr, row + 1, col);

        int ways = w1 + w2 + w3 + w4;
        return ways;

    }

    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int arr[][] = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i == 1 && j == 0) || (i == 1 && j == 2) || (i == 3 && j == 1)) {
                    arr[i][j] = 1;
                } else
                    arr[i][j] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println(RateINAMazeSolver(arr, 0, 0));

    }
}
