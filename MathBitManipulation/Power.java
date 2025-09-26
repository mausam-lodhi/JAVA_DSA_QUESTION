public class Power {
    public static int power1(int a, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPower = power1(a, n / 2);
        int fullPower = halfPower * halfPower;
        if (n % 2 != 0) {
            return fullPower * a;
        }
        return fullPower;
    }

    public static int power2(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = power2(a, n / 2) * power2(a, n / 2);
        if (n % 2 != 0) {
            return halfPower * a;
        }
        return halfPower;
    }

    public static int power3(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power3(a, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(power3(2, 3));
    }
}
