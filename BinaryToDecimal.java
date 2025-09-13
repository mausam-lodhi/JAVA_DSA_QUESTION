public class BinaryToDecimal {

    public static double binToDecimal(int number) {
        int pow = 0;
        double decimal = 0;

        while (number > 0) {
            int reminder = number % 10;
            number /= 10;
            decimal = reminder * Math.pow(2, pow) + decimal;
            pow++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        int binary = 111;
        System.out.print(binToDecimal(binary));
    }
}
