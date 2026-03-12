import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Input tidak valid. Jumlah harus lebih dari 0.");
        } else {
            long[] fib = new long[n];
            long total = 0;
            int genap = 0, ganjil = 0;

            System.out.println("Deret Fibonacci:");
            
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    fib[i] = 0;
                } else if (i == 1) {
                    fib[i] = 1;
                } else {
                    fib[i] = fib[i - 1] + fib[i - 2];
                }

                System.out.print(fib[i] + " ");

                total += fib[i];

                if (fib[i] % 2 == 0) {
                    genap++;
                } else {
                    ganjil++;
                }
            }

            long terbesar = fib[n - 1];
            long terkecil = fib[0];
            double rataRata = (double) total / n;

            // Output Statistik
            System.out.println("\n");
            System.out.println("Total         : " + total);
            System.out.println("Rata-rata     : " + rataRata);
            System.out.println("Nilai terbesar: " + terbesar);
            System.out.println("Nilai terkecil: " + terkecil);
            System.out.println("Jumlah genap  : " + genap);
            System.out.println("Jumlah ganjil : " + ganjil);
        }
        
        input.close();
    }
}