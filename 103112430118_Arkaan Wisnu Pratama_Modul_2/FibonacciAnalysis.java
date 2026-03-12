package Modul2;

import java.util.Scanner;

public class FibonacciAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah deret: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Input tidak valid. Jumlah harus lebih dari 0.");
            return;
        }

        long[] fib = new long[n];
        fib[0] = 0;
        if (n > 1) fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println("\nDeret Fibonacci:");
        for (int i = 0; i < n; i++) {
            if (i < n - 1)
                System.out.print(fib[i] + " ");
            else
                System.out.println(fib[i]);
        }

        long total = 0;
        long terbesar = fib[0];
        long terkecil = fib[0];
        int jumlahGenap = 0;
        int jumlahGanjil = 0;

        for (int i = 0; i < n; i++) {
            total += fib[i];

            if (fib[i] > terbesar) terbesar = fib[i];
            if (fib[i] < terkecil) terkecil = fib[i];

            if (fib[i] % 2 == 0)
                jumlahGenap++;
            else
                jumlahGanjil++;
        }

        double rata = (double) total / n;

        System.out.println();
        System.out.printf("%-18s: %d%n",  "Total",         total);
        System.out.printf("%-18s: %s%n",  "Rata-rata",     formatDouble(rata));
        System.out.printf("%-18s: %d%n",  "Nilai terbesar", terbesar);
        System.out.printf("%-18s: %d%n",  "Nilai terkecil", terkecil);
        System.out.printf("%-18s: %d%n",  "Jumlah genap",  jumlahGenap);
        System.out.printf("%-18s: %d%n",  "Jumlah ganjil", jumlahGanjil);

        scanner.close();
    }

    static String formatDouble(double value) {
        if (value == (long) value)
            return String.valueOf((long) value);
        else
            return String.valueOf(value);
    }
}