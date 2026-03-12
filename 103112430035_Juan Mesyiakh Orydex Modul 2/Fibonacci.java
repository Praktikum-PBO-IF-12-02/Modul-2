public class Fibonacci {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Masukkan jumlah deret Fibonacci: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Input tidak valid. Jumlah harus lebih dari 0.");
        } else {

            int a = 0;
            int b = 1;
            int total = 0;
            int terbesar = 0;
            int terkecil = 0;
            int genap = 0;
            int ganjil = 0;

            System.out.println("Deret Fibonacci:");

            for (int i = 1; i <= n; i++) {

                System.out.print(a + " ");

                total = total + a;

                if (a > terbesar) {
                    terbesar = a;
                }

                if (a < terkecil) {
                    terkecil = a;
                }

                if (a % 2 == 0) {
                    genap++;
                } else {
                    ganjil++;
                }

                int c = a + b;
                a = b;
                b = c;
            }

            double rata = (double) total / n;

            System.out.println("\nTotal = " + total);
            System.out.println("Rata-rata = " + rata);
            System.out.println("Terbesar = " + terbesar);
            System.out.println("Terkecil = " + terkecil);
            System.out.println("Jumlah genap = " + genap);
            System.out.println("Jumlah ganjil = " + ganjil);
        }
    }
}