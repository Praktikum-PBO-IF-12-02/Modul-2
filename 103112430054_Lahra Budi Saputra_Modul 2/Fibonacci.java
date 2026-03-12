import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Untuk meminta input jumlah deret
        System.out.print("Masukkan jumlah deret: ");
        int n = input.nextInt();

        // Validasi input
        if (n <= 0) {
            System.out.println("Input tidak valid. Jumlah harus lebih dari 0");
        } else {
            // Untuk menyimpan deret fibonacci di array
            int[] fib = new int[n];
            fib[0] = 0;
            if (n > 1) {
                fib[1] = 1;
            }

            // Untuk menghitung deret fibonacci
            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }

            System.out.println("\n\nDeret Fibonacci:");
            for (int i = 0; i < n; i++) {
                System.out.print(fib[i] + " ");
            }
            
            // Untuk memberikan jarak 2 baris kosong
            System.out.println("\n\n");

            // Inisialisasi variabel menghitung total, minimal, maksimal, genap, ganjil
            int total = 0;
            int maksimal = fib[0];
            int minimal = fib[0];
            int genap = 0;
            int ganjil = 0;

            for (int i = 0; i < n; i++) {
                total += fib[i];

                if (fib[i] > maksimal) {
                    maksimal = fib[i];
                }
                if (fib[i] < minimal) {
                    minimal = fib[i];
                }
                if (fib[i] % 2 == 0) {
                    genap++;
                } else {
                    ganjil++;
                }
            }

            // Untuk menghitung rata-rata
            double rataRata = (double) total / n;

            // Untuk menampilkan hasil
            System.out.println("Total          : " + total);
            System.out.println("Rata-rata      : " + rataRata);
            System.out.println("Nilai terbesar : " + maksimal);
            System.out.println("Nilai terkecil : " + minimal);
            System.out.println("Jumlah genap   : " + genap);
            System.out.println("Jumlah ganjil  : " + ganjil);
        }

        input.close();
    }
}





