public class searchInSortedMatri {

    public static boolean linearSearch(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("The " + key + "is found at (" + i + "," + j + ')');
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean stairecaseSearch(int matrix[][], int key) {
        int row = 0;
        int col = matrix.length - 1;

        while (row <= matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("The " + key + "is found at (" + row + "," + col + ')');
                return true;
            } else if (matrix[row][col] > key) {
                col--;
            } else
                row++;
        }
        return false;

    }

    public static int frequency(int matrix[][], int key) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (key == matrix[i][j]) {
                    count++;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {

         int matrix[][]  =   {{1,2,3,4,},
                            {5,6,7,8},
                            {9,10,11,12},
                 { 13, 14, 15, 16} };

        //   System.out.println(linearSearch(matrix, 15));
        // System.out.println(stairecaseSearch(matrix, 15));

        System.out.println(frequency(matrix,7));

    }
}
