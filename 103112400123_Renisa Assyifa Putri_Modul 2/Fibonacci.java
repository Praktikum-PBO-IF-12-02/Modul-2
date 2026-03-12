import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // minta input jumlah deret
        System.out.print("Masukkan jumlah deret: ");
        int n = input.nextInt();

        // validasi input
        if (n <= 0) {
            System.out.println("Input tidak valid. Jumlah harus lebih dari 0.");
        } else {
            // simpan deret fibonacci di array
            int[] fib = new int[n];
            fib[0] = 0;
            if (n > 1) {
                fib[1] = 1;
            }

            // ngitung deret fibonacci
            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }

            // tampilkan deret
            System.out.println("\nDeret Fibonacci:");
            for (int i = 0; i < n; i++) {
                System.out.print(fib[i] + " ");
            }
            System.out.println();

            // ngitung total, min, max, genap, ganjil
            int total = 0;
            int max = fib[0];
            int min = fib[0];
            int genap = 0;
            int ganjil = 0;

            for (int i = 0; i < n; i++) {
                total += fib[i];

                if (fib[i] > max) {
                    max = fib[i];
                }
                if (fib[i] < min) {
                    min = fib[i];
                }
                if (fib[i] % 2 == 0) {
                    genap++;
                } else {
                    ganjil++;
                }
            }

            // ngitung rata-rata
            double rataRata = (double) total / n;

            // tampilkan hasil
            System.out.println("\nTotal          : " + total);
            System.out.println("Rata-rata      : " + rataRata);
            System.out.println("Nilai terbesar : " + max);
            System.out.println("Nilai terkecil : " + min);
            System.out.println("Jumlah genap   : " + genap);
            System.out.println("Jumlah ganjil  : " + ganjil);
        }

        input.close();
    }
}
