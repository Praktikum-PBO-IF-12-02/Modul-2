import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah deret : ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Input tidak valid. Jumlah harus lebih dari 0.");
            return;
        }

        int a = 0;
        int b = 1;
        int total = 0;
        int max = 0; 
        int min = 0;
        int genap = 0;
        int ganjil = 0;

        System.out.println("\nDeret Fibonacci :");

        for (int i = 0; i < n; i++) {

            int fib = a;
            System.out.print(fib + " ");

            total += fib;

            if (i == 0) {
                max = fib;
                min = fib;
            }

            if (fib > max) max = fib;
            if (fib < min) min = fib;

            if (fib % 2 == 0) genap++;
            else ganjil++;

            int next = a + b;
            a = b;
            b = next;
        }

        double rata = (double) total / n;

        System.out.println("\n\nTotal : " + total);
        System.out.println("Rata-rata : " + rata);
        System.out.println("Nilai terbesar : " + max);
        System.out.println("Nilai terkecil : " + min);
        System.out.println("Jumlah genap : " + genap);
        System.out.println("Jumlah ganjil : " + ganjil);

        input.close();
    }
}