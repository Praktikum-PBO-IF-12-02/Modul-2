import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah deret Fibonacci: ");
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

        System.out.println("Deret Fibonacci:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            total += a;

            if (i == 1) {
                max = a;
                min = a;
            } else {
                if (a > max) {
                    max = a;
                }
                if (a < min) {
                    min = a;
                }
            }

            if (a % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }

            int next = a + b;
            a = b;
            b = next;
        }

        double rata = (double) total / n;

        System.out.println();
        System.out.println("Total deret: " + total);
        System.out.println("Rata-rata: " + rata);
        System.out.println("Nilai terbesar: " + max);
        System.out.println("Nilai terkecil: " + min);
        System.out.println("Jumlah bilangan genap: " + genap);
        System.out.println("Jumlah bilangan ganjil: " + ganjil);
    }
}