package hmifunsri;

import java.util.Arrays;

public class Method {

    public static void main(String[] args) {

        double kali = kali(5, 3);
        System.out.println("Hasil Perkalian: " + kali);

        double kali2 = kali(8, 7);
        System.out.println("Hasil Perkalian: " + kali2);

        toUppercase("Hello World!");

        int[] arr = {4, 7, 6, 2, 7, 5};
        int max = nilaiTerbesar(arr);
        System.out.println("Nilai terbesar dari array: " + max);

        gabungArray(arr, new int[] {2, 4, 3, 2});
    }

    static double kali(double a, double b) {
        return a * b;
    }

    static void toUppercase(String str) {
        System.out.println(str.toUpperCase());
    }

    static int nilaiTerbesar(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    static void gabungArray(int[] a, int[] b) {

        int n = a.length + b.length;
        int[] arr = new int[n];

        int j = 0;
        for (int i = 0; i < a.length; i++) {
            arr[j++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            arr[j++] = b[i];
        }

        System.out.println(Arrays.toString(arr));
    }

//    f(x) = ax + b
}
