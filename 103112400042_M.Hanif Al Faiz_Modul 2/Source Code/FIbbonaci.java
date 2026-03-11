public class FIbbonaci {

    public static void main(String[] args) throws Exception {
        System.out.print("Masukkan jumlah deret Fibonacci (n): ");

        int n = 0;
        int c = System.in.read();
        while (c >= '0' && c <= '9') {
            n = n * 10 + (c - '0');
            c = System.in.read();
        }

        if (n <= 0) {
            System.out.println("Input tidak valid. Jumlah harus lebih dari 0.");
            return;
        }

        long[] fibonacci = new long[n];
        fibonacci[0] = 0;
        if (n > 1) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.print("Deret Fibonacci: ");
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                System.out.print(fibonacci[i] + ", ");
            } else {
                System.out.print(fibonacci[i]);
            }
        }
        System.out.println();

        long total = 0;
        long terbesar = fibonacci[0];
        long terkecil = fibonacci[0];
        int jumlahGenap = 0;
        int jumlahGanjil = 0;

        for (int i = 0; i < n; i++) {
            total += fibonacci[i];

            if (fibonacci[i] > terbesar) {
                terbesar = fibonacci[i];
            }

            if (fibonacci[i] < terkecil) {
                terkecil = fibonacci[i];
            }

            if (fibonacci[i] % 2 == 0) {
                jumlahGenap++;
            } else {
                jumlahGanjil++;
            }
        }

        double rata = (double) total / n;
        long rataBulat = (long) (rata * 100);
        long rataDesimal = rataBulat % 100;
        if (rataDesimal < 0) {
            rataDesimal = -rataDesimal;
        }

        System.out.println("Total seluruh angka   : " + total);
        System.out.println("Rata-rata deret       : " + (rataBulat / 100) + "." + (rataDesimal < 10 ? "0" : "") + rataDesimal);
        System.out.println("Nilai terbesar        : " + terbesar);
        System.out.println("Nilai terkecil        : " + terkecil);
        System.out.println("Jumlah bilangan genap : " + jumlahGenap);
        System.out.println("Jumlah bilangan ganjil: " + jumlahGanjil);
    }
}
