import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret: ");
        int n = input.nextInt();

        int a = 0, b = 1;
        int total = 0;
        int max = 0, min = 0;
        int genap = 0, ganjil = 0;

        for (int i = 0; i < n; i++) {

            int fib;

            if (i == 0){    
                fib = 0;
            }else if (i == 1) {
                fib = 1;
            }else {
                fib = a + b;
                a = b;
                b = fib;
            }

            System.out.print(fib + " ");

            total += fib;

            if (i == 0) {
                max = fib;
                min = fib;
            }

            if (fib > max) {    
                max = fib;
            };

            if (fib < min) {
                min = fib;

            };

            if (fib % 2 == 0) {
                genap++;
            }
            else {
                ganjil++;
            }
        }

        System.out.println("\nTotal = " + total);
        System.out.println("Rata-rata = " + (double) total / n);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Genap = " + genap);
        System.out.println("Ganjil = " + ganjil);
    }
}