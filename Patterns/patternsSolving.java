public class patternsSolving {
    public static void main(String[] args) {
        int size = 7;
        for (int i = 0; i < size; i++) {
            for (int j = size - i; j < size; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < size - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int j = size - i; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}