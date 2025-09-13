public class SpiralMatrixII {
    public static int[][] generateMatrix(int n) {
        int arr[][] = new int[n][n];
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = n - 1;
        int colEnd = n - 1;
        int value = 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {

            for (int j = colStart; j <= colEnd; j++) {
                arr[rowStart][j] = value;
                value += 1;
            }
            for (int i = rowStart + 1; i <= rowEnd; i++) {
                arr[i][colEnd] = value;
                value += 1;

            }
            if (rowStart < rowEnd) {
                for (int j = colEnd - 1; j >= colStart; j--) {
                    arr[rowEnd][j] = value;
                    value += 1;

                }
            }
            if (colStart < colEnd) {
                for (int i = rowEnd - 1; i >= rowStart + 1; i--) {
                    arr[i][colStart] = value;
                    value += 1;
                }
            }
            rowStart++;
            colStart++;
            rowEnd--;
            colEnd--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }

    public static void main(String[] args) {
        generateMatrix(3);

    }
}
