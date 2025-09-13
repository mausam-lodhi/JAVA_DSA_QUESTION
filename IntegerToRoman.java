public class IntegerToRoman {
    public static String integerToRoman(int num) {

        String roman = "";
        int numbers[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String romans[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        for (int i = 0; i < numbers.length; i++) {
            while (num >= numbers[i]) {
                roman = roman + romanLetters[i];
                num = num - numbers[i];
            }
        }
        return roman;
    }

    public static void main(String[] args) {
        int num = 123;
        System.out.println(integerToRoman(num));
    }
}
