import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a = 0, b = 1, sum = 0, sum1 = 1;

        System.out.println("Hello I am here Learning Java from Scratch");
        Scanner enter = new Scanner(System.in);
        String name = enter.nextLine();
        String name1 = enter.next();
        System.out.println("Enter The Length Of Series");
        int len = enter.nextInt();
        // char ch = name.trim().charAt(0);
        // if (ch >= 'a' && ch <= 'z') {
        // System.out.println("It Starts From Lowercase");
        // } else {
        // System.out.println("It Starts From Uppercase");
        // }
        // System.out.println(Math.max(21, 89));
        System.out.print(a);
        System.out.print(' ');
        System.out.print(b);
        for (int i = 0; i < len; i++) {
            sum = a + b;
            System.out.print(' ');
            System.out.print(sum);
            a = b;
            b = sum;
            sum1 += sum;
        }
        System.out.print('=');
        System.out.print(sum1);
    }

}
