public class Clearithbit {

    public static int ClearIthBit(int number, int index) {
        return (number & (~(index << 1)));
    }

    public static void main(String[] args) {
        int number = 8;
        int index = 1;
        System.out.print(ClearIthBit(number, index));
    }
}
