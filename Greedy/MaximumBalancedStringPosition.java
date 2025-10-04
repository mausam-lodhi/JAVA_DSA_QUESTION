public class MaximumBalancedStringPosition {

    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        int i = 0;
        int balance = 0, count = 0;
        while (i < str.length()) {
            if (str.charAt(i) == 'L') {
                balance += 1;
            } else
                balance -= 1;
            if (balance == 0) {
                count += 1;
            }
            i++;
        }
        System.out.println(
                "The number of balance strings that can be formed are : " + count);
    }
}
