import java.util.Scanner;

public class spiralMatrix {
    public static void main(String[] args) {

        int matrix[][]  =   {{1,2,3,4,},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
        System.out.println("The elements of the arrays are : ");
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length - 1;
        int colEnd = matrix.length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int j = colStart; j <= colEnd; j++) {//left to right row
                System.out.print(matrix[rowStart][j] + " ");
            }
            for (int i = rowStart + 1; i <= rowEnd; i++) {//right to bottom
                System.out.print(matrix[i][colEnd] + " ");
            }
            for (int j = colEnd - 1; j >= colStart; j--) {//bottom to lef column
                System.out.print(matrix[rowEnd][j] + " ");
            }
             for (int i = rowEnd - 1; i >= rowStart+1; i--) {//right to bottom
                System.out.print(matrix[i][colStart] + " ");
            }

            rowStart++;
            colStart++;
            colEnd--;
            rowEnd--;
        }
        System.out.println();
    }
}
