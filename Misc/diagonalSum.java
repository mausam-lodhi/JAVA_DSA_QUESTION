public class diagonalSum {
    public static void main(String[] args) {
         int matrix[][]  =   {{1,2,3,4,},
                            {5,6,7,8},
                            {9,10,11,12},
                 { 13, 14, 15, 16 } };
         int sumLeftToRight = 0;
         int sumRightToLeft = 0;

         for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix.length; j++) {
                 if (i == j) {
                     sumLeftToRight += matrix[i][j];
                 }
                 if ((i + j) ==matrix.length-1) {
                     sumRightToLeft += matrix[i][j];
                    System.out.print(matrix[i][j] + " ");
                 }
             }
         }
         System.out.println("The sum is from left to right is " + sumLeftToRight);
         System.out.println("The sum is from right to left is " + sumRightToLeft);


    }
}
