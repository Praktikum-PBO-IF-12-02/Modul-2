import java.util.Scanner;

public class fibonaci {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    
    int a = 0, b = 1 ;
    int total = 0, terbesar = 0, terkecil = 0, genap = 0, ganjil = 0;
    System.out.print("Masukkan Jumlah Deret : ");
    int Deret = input.nextInt();

    System.out.println();
    if ( Deret <= 0 ) {
      System.out.println("input tidak valid, Jumlah harus lebih dari 0");
    } else {
      System.out.println("Deret Fibonacci : ");
        for(int i = 1; i <= Deret; i++) {
          System.out.print(a + " ");

          // mencari nilai total
          total += a;
          // mencari nilai ganjil dan genap
          if(a % 2 == 0){
            genap++;
          }  else {
            ganjil++;
          }
          // mencari nilai terbesar
          if (a > terbesar){
            terbesar = a;
          }
          // mencari nilai terkecil
          if (a < terkecil){
            terkecil = a;
          } 

          int next = a + b;
          a = b;
          b = next;
          
        }

        // mencari nilai rata rata
        double rata = (double) total / Deret;

      System.out.println();
      System.out.println();
      System.out.println("Total          : " + total);
      System.out.println("Rata - Rata    : " + rata);
      System.out.println("Nilai Terbesar : " + terbesar);
      System.out.println("Nilai Terkecil : " + terkecil);
      System.out.println("Jumlah Genap   : " + genap);
      System.out.println("Jumlah Ganjil  : " + ganjil);
    }
    
  }
}
