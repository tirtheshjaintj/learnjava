import java.util.Scanner;

public class Tj {
    public static void main(String[] args) {
        // System.out.print("Hello World Bro");
        String name = "Tirthesh";
        do {
            System.out.println(name + " Is Best");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            for (int i = 1; i <= num; i++) {
                for (int j = i; j > 0; j--) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            for (int i = 1; i <= num; i++) {
                for (int j = i; j > 0; j--) {
                    System.out.print(i);
                }
                System.out.print("\n");

            }
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.print("\n");

            }
        } while (true);
    }
}
