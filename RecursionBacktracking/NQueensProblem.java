public class NQueensProblem {
    public static boolean isSafe(char chessBoard[][], int row, int col) {
        for (int i = row - 1; i >= 0; i--) {// for vertical
            if (chessBoard[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) { // diagonal left up
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < chessBoard.length; i--, j++) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static boolean nQueens(char chessBoard[][], int row) {
        if (row == chessBoard.length) {
            System.out.println("_______________@_____________");
            printBoard(chessBoard);
            return true;
        }
        for (int j = 0; j < chessBoard.length; j++) {
            if (isSafe(chessBoard, row, j)) {
                chessBoard[row][j] = 'Q';
                if (nQueens(chessBoard, row + 1)) {
                    return true;
                }

                chessBoard[row][j] = 'x';

            }
        }
        return false;
    }

    public static void printBoard(char chessBoard[][]) {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char chessBoard[][] = new char[n][n];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                chessBoard[i][j] = 'x';
            }
        }
        if (nQueens(chessBoard, 0)) {
            System.out.println("solution is possible ");
        }

    }
}
