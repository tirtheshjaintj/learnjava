import java.util.Arrays;
import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = "Tirthesh";
        System.out.println(Arrays.toString(name.toCharArray()));
        char tg = 'T';
        System.out.println(search(name, tg));
        System.out.println("Enter Any Number");
        int n1 = in.nextInt();
        int n2 = 0;
        int n3 = Integer.MIN_VALUE;
        System.out.println(n3);
        if (n1 < 0) {
            n1 *= -1;
        }
        while (n1 > 0) {

            n1 /= 10;
            n2++;
        }
        System.out.println("The Length is " + n2);
        int num = in.nextInt();
        int[] n = new int[num];
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(n));
    }

    static boolean search(String str, char tg) {
        if (str.length() == 0) {
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (tg == str.charAt(i)) {
                    return true;
                }
            }
            return false;

        }
    }

}
