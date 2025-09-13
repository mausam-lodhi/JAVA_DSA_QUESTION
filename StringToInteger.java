public class StringToInteger {

    public static int stringToInteger(String str) {
        if (str == "") {
            return 0;
        }
        int i = 0;
        int sign = 1;
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        if (str.charAt(i) == '+') {
            sign = 1;
            i++;
            System.out.println("h");
        } else if (str.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        long result = 0;
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }
        if (result * sign > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (result * sign < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) result * sign;
    }

    public static void main(String[] args) {
        String str = "-91283472332";
        System.out.println(stringToInteger(str));
    }
}
