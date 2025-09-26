public class PowerOptimised {
    public static double myPow(double x, int n) {
        if (n < 0) {
            return (1 / myPow(x, Math.abs(n)));
        }

        if (n == 0) {

            return 1;
        }
        double half = myPow(x, n / 2);
        if (n % 2 == 0) {

            return half * half;
        } else
            return half * half * x;

    }

    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
    }
}
