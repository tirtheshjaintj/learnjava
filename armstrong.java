public class armstrong {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            if (arm(i)) {
                System.out.print(i + "   ");
            }
        }
    }

    static boolean arm(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem*rem;
            n /= 10;
        }
        return sum == original;

    }
}
