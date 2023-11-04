package hmifunsri;

import java.util.Scanner;

public class BatuGuntingKertas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========= Batu Gunting Kertas =========");
        System.out.print("\nMasukkan pilihan user 1 [batu/gunting/kertas]: ");
        String a = scanner.next();
        System.out.print("Masukkan pilihan user 2 [batu/gunting/kertas]: ");
        String b = scanner.next();

        scanner.close();

        a = a.trim().toLowerCase();
        b = b.trim().toLowerCase();

        if (a.equals(b)) System.out.println("\n====== DRAW ======");
        else {
            System.out.println();
            if (a.equals("batu")) {
                switch (b) {
                    case "gunting":
                        System.out.println("User 1 menang!");
                        break;
                    case "kertas":
                        System.out.println("User 2 menang!");
                        break;
                    default:
                        System.err.println("Input tidak dikenal");
                }
            } else if(a.equals("gunting")) {
                switch (b) {
                    case "batu":
                        System.out.println("User 2 menang!");
                        break;
                    case "kertas":
                        System.out.println("User 1 menang");
                        break;
                    default:
                        System.err.println("Input tidak dikenal");
                }
            } else if(a.equals("kertas")) {
                switch (b) {
                    case "batu":
                        System.out.println("User 1 menang");
                        break;
                    case "gunting":
                        System.out.println("User 2 menang");
                        break;
                    default:
                        System.err.println("Input tidak dikenal");
                }
            } else {
                System.err.println("Input tidak dikenal");
            }
        }
    }
}
