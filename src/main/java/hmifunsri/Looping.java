package hmifunsri;

import java.util.Scanner;

public class Looping {

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {

                if (i % 2 == 0)
                    System.out.print("#");
                else
                    System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("\n=====================================\n");

        int a = 21;
        do {
            System.out.print(a + " ");
            a = a - 3;
        } while (a >= 0);

        System.out.println("\n=====================================\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input angka: ");
        int num = scanner.nextInt();
        scanner.close();

        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = num; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
