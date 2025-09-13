public class StringsMultiply {
    public static String multiply(String num1, String num2) {
        Double n1 = Double.parseDouble(num1);
        Double n2 = Double.parseDouble(num2);
        Double total = n1 * n2;
        return String.valueOf(total);

    }

    public static void main(String[] args) {
        String num1 = "123456789";
        String num2 = "987654321";
        System.out.println(multiply(num1, num2));

    }
}