/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dev.renwxyz.deretfibonacci;
import java.util.Scanner;

/**
 *
 * @author Rendy
 */
public class DeretFibonacci {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah deret Fibonacci: ");
        int n = input.nextInt();
        
        if (n <= 0) {
            System.out.println("Input tidak valid. Jumlah harus lebih dari 0.");
            return;
        }
        
        int a = 0, b = 1;
        int total = 0;
        int terbesar = Integer.MIN_VALUE;
        int terkecil = Integer.MAX_VALUE;
        int genap = 0, ganjil = 0;

        System.out.printf("\nDeret Fibonacci:");

        for (int i = 0; i < n; i++) {
            
            System.out.print(a + " ");
            
            total += a;

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

            int next = a + b;
            a = b;
            b = next;
        }

        double rata = (double) total / n;
        System.out.printf("\n\n%-15s:%d%n","Total: ", total);
        System.out.printf("%-15s:%s%n","Rata-rata: ", rata);
        System.out.printf("%-15s:%d%n","Terbesar: ", terbesar);
        System.out.printf("%-15s:%d%n","Terkecil: ", terkecil);
        System.out.printf("%-15s:%d%n","Jumlah Genap: ", genap);
        System.out.printf("%-15s:%d%n","Jumlah Ganjil: ", ganjil);
    }
}
