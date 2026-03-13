import java.util.Scanner;

public class laprak1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah deret: ");
        int n = input.nextInt();
        
        if (n <= 0) {
            System.out.println("Input tidak valid. Jumlah harus lebih dari 0.");
        } else {            
            long a = 0, b = 1;
            long total = 0;
            long max = 0;
            long min = 0;
            int genap = 0;
            int ganjil = 0;

            System.out.println("\nDeret Fibonacci:");
        
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");

                // Total
                total += a;

                // Nilai Terbesar & Terkecil
                if (a > max) max = a;
                if (a < min) min = a;

                // Jumlah Genap & Ganjil
                if (a % 2 == 0) {
                    genap++;
                } else {
                    ganjil++;
                }

                // Menghitung angka berikutnya
                long next = a + b;
                a = b;
                b = next;
            }

            // Menghitung Rata-rata
            double rataRata = (double) total / n;

            // Menampilkan Output 
            System.out.println("\n\nTotal          : " + total);
            System.out.println("Rata-rata      : " + rataRata);
            System.out.println("Nilai terbesar : " + max);
            System.out.println("Nilai terkecil : " + min);
            System.out.println("Jumlah genap   : " + genap);
            System.out.println("Jumlah ganjil  : " + ganjil);
        }
        
        input.close();
    }
}