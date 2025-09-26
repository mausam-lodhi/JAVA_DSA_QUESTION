public class CountSubmatrices {
    public static int countSubmatrices(int[][] grid, int k) {

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        int arr[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 && j == 0) {
                    arr[i][j] = grid[i][j];
                } else if (i == 0) {
                    arr[i][j] += arr[i][j - 1] + grid[i][j];
                } else if (j == 0) {
                    arr[i][j] += arr[i - 1][j] + grid[i][j];
                } else
                    arr[i][j] += arr[i - 1][j] + grid[i][j] + arr[i][j - 1] - arr[i - 1][j - 1];

                if (arr[i][j] < k) {
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int grid[][] = { { 1, 10 }, { 7, 2 }, { 9, 1 }, { 4, 1 } };
        System.out.println(countSubmatrices(grid, 8));
    }
}