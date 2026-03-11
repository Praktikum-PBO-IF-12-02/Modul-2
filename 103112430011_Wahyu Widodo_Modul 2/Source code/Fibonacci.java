import java.util.Scanner; 

/**
 *
 * @author wahyuuuwid
 */
public class Fibonacci {
    public static void main(String[] args){
        // menggunakan library tambahan Scanner untuk bisa membaca input dari user
        Scanner input = new Scanner(System.in);

        // minta user untuk memasukkan jumlah deret Fibonacci yang diinginkan
        System.out.print("Masukkan jumlah deret: ");
        int n = input.nextInt();

        if (n <= 0) {
            // jika input jumlah deret kurang dari sama dengan 0, tampilkan input tidak valid
            System.out.println("Input tidak valid. Jumlah harus lebih dari 0.");
        } else {
            // jika input valid lebih dari 0, blok kode di bawah ini akan dieksekusi
            int a = 0, b = 1;
            int total = 0;
            int terbesar = 0;
            int terkecil = 0;
            int genap = 0;
            int ganjil = 0;

            System.out.println("\nDeret Fibonacci:");

            for (int i = 0; i < n; i++) {
                int fib;

                if (i == 0) {
                    fib = 0;
                } else if (i == 1) {
                    fib = 1;
                } else {
                    fib = a + b;
                    a = b;
                    b = fib;
                }

                System.out.print(fib + " ");
                total += fib;

                // mencari nilai terbesar dan terkecil dari deret Fibonacci
                if (fib > terbesar) {
                    terbesar = fib;
                }

                if (fib < terkecil) {
                    terkecil = fib;
                }

                // menghitung berapa sih jumlah bilangan genap dan ganjil dalam deret Fibonacci
                if (fib % 2 == 0) {
                    genap++;
                } else {
                    ganjil++;
                }
            }

            // hitung rata-rata dengan cara membagi total dengan jumlah deret (n)
            double rataRata = (double) total / n;
            System.out.println("\n");
            System.out.println("Total           : " + total);
            System.out.println("Rata-rata       : " + rataRata);
            System.out.println("Nilai terbesar  : " + terbesar);
            System.out.println("Nilai terkecil  : " + terkecil);
            System.out.println("Jumlah genap    : " + genap);
            System.out.println("Jumlah ganjil   : " + ganjil);
        }
    }
}
