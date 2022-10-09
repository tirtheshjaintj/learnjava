import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
// import java.util.Arrays;

public class Func {
    static int a = 10;

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 45, 5, 6 };
        // change(arr);
        add(arr);
        int a = 90;
        {
            a = 10;
        }

        System.out.println(a);

        System.out.println(arr[0]);
        Scanner in = new Scanner(System.in);
        int res = sum(1, 2, 3);
        System.out.println(res);
        String greet = greet("Tirthesh");
        System.out.println(greet);
    }

    static int sum(int a, int b, int c) {
        System.out.println(a + b + c);
        return a + b + c;
    }

    static String greet(String hello) {
        String mess = "Hello Hye " + hello;
        return mess;
    }

    static String name(String name) {
        return "hello";
    }

    // static int change(int[] num) {
    // num[0] = 99;
    // return 0;
    // }

    static void add(int... v) {
        int sum = 0;
        for (int i = 0; i < Array.getLength(v); i++) {
            sum += v[i];
        }
        System.out.println("The Sum Is ");
        System.out.println(sum);

    }
}
