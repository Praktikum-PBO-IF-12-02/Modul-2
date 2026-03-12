import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah deret: ");
        int n = input.nextInt();

        // Validasi input
        if (n <= 0) {
            System.out.println("Input tidak valid. Jumlah harus lebih dari 0.");
            return;
        }

        long[] fibo = new long[n];
        long total = 0;
        int genap = 0;
        int ganjil = 0;

        System.out.println("\nDeret Fibonacci:");
        
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                fibo[i] = 0;
            } else if (i == 1) {
                fibo[i] = 1;
            } else {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }

            // Tampilin deret
            System.out.print(fibo[i] + " ");

            // Kalkulasi stat
            total += fibo[i];
            if (fibo[i] % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }
        }

        // Ngitung rata2, terbesar sama terkecil
        double rataRata = (double) total / n;
        long terbesar = fibo[n - 1];
        long terkecil = fibo[0];

        // Output Stat
        System.out.println("\n\nTotal           : " + total);
        System.out.println("Rata-rata       : " + rataRata);
        System.out.println("Nilai terbesar  : " + terbesar);
        System.out.println("Nilai terkecil  : " + terkecil);
        System.out.println("Jumlah genap    : " + genap);
        System.out.println("Jumlah ganjil   : " + ganjil);

        input.close();
    }
}