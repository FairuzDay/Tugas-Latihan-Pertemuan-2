/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan24.perbandingan.dua.buah.nilai;

import java.util.Scanner;

/*
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO-6
 * NIM		: 10116568 
 * Description : Program Perbandingan 2 buah nilai
 *
 */
public class PBO610116568Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);        
        int valueA, valueB;

        System.out.println("\n======== Program Perbandungan Nilai ========\n\n");
        System.out.print("Masukan Nilai Pertama\t: ");
        valueA = scanner.nextInt();
        System.out.print("Masukan Nilai Kedua\t: ");
        valueB = scanner.nextInt();

        System.out.println( 
            "\n\nHasil : "
            .concat(String.valueOf(valueA))
            .concat((valueA == valueB ? " Sama dengan " : (valueA > valueB ? " Lebih besar dari " : " Lebih kecil dari ")))
            .concat(String.valueOf(valueB))
         );


    }
    
    
}
