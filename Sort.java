import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] num = { 10, 20, 30, 1, 5, 100, 5 };
        sort(num, 0);
        System.out.println(Arrays.toString(num));
        sort(num, 1);
        System.out.println(Arrays.toString(num));

    }

    public static void sort(int[] num, int ch) {
        int t;
        if (ch <= 0) {
            for (int i = 0; i < num.length; i++) {
                for (int j = i + 1; j < num.length; j++) {
                    if (num[i] > num[j]) {
                        t = num[i];
                        num[i] = num[j];
                        num[j] = t;
                    }

                }

            }
        } else {
            for (int i = 0; i < num.length; i++) {
                for (int j = i + 1; j < num.length; j++) {
                    if (num[i] < num[j]) {
                        t = num[i];
                        num[i] = num[j];
                        num[j] = t;
                    }

                }

            }
        }
    }
}
