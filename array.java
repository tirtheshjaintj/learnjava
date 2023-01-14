import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class array {
    static final String hello = "Tirthesh";

    public static void main(String[] args) {
        int[][] num = new int[5][5];
        int ros[] = new int[5];
        System.out.println(hello);
        Scanner in = new Scanner(System.in);
        String new12 = in.nextLine();
        System.out.println(new12);
        String[][] arr = { { "Tirthesh", "Jain", "Is", "Here" }, { "I", "Am", "Also", "Here" },
                { "Tirthesh", "Jain", "Is", "Here" } };
        System.out.println(arr[0]);
        // char[] a r r1=new char[5];
        // System.out.print("\n");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(Arrays.toString(arr[i]));
        // }
        for (String na : arr[0]) {
            System.out.println(na);
        }
        for (String na : arr[1]) {
            System.out.println(na);
        }
        for (String na : arr[2]) {
            System.out.println(na);
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++)
                num[i][j] = i;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(Arrays.toString(num[i]));
        }
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);
        for (int i = 0; i < 10; i++) {
            for (int k = 10 - i; k > 1; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        int[] samp = { 1, 2, 3, 4, 5, 6, 7 };
        reverse(samp);
    }

    public static void swap(int[] arr, int in1, int in2) {
        int temp = arr[in1];
        arr[in1] = arr[in2];
        arr[in2] = temp;
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

}
