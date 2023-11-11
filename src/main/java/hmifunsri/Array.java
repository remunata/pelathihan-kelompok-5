package hmifunsri;

import com.sun.source.doctree.EscapeTree;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] databaseMahasiswa = new String[5][2];

        databaseMahasiswa[0][0] = "Philifs";
        databaseMahasiswa[1][0] = "Bintara";
        databaseMahasiswa[2][0] = "Fahrezi";
        databaseMahasiswa[3][0] = "Nadia";
        databaseMahasiswa[4][0] = "Ayu";

        System.out.println("\nData Mahasiswa lama:");
        for (int i = 0; i < databaseMahasiswa.length; i++) {
            System.out.println(Arrays.toString(databaseMahasiswa[i]));
        }

        for (int i = 0; i < databaseMahasiswa.length; i++) {
            System.out.print("Masukkan nomor induk mahasiswa " + databaseMahasiswa[i][0] + " : ");
            String nomorInduk = sc.next();
            databaseMahasiswa[i][1] = nomorInduk;
        }

        System.out.println("\nData Mahasiswa baru:");
        for (int i = 0; i < databaseMahasiswa.length; i++) {
            System.out.println(Arrays.toString(databaseMahasiswa[i]));
        }

        int[][] mtr = new int[5][5];

        for (int i = 0; i < mtr.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                mtr[i][j] = 1;
            }
        }

        for (int[] arr : mtr) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
