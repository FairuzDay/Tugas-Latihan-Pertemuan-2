/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan22.perhitungan.lingkaran;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO-6
 * NIM		: 10116568
 * Description : Program Penghitungan Lingkaran
 */
public class PBO610116568Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    private static final double PHI = 3.14159;
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);        

        int diameter = 0;
        boolean valid = false;

        System.out.println("\n=============== Perhitungan Lingkaran ===============");

        do {
            try {                
                System.out.print("\nMasukan Nilai diameter Lingkaran : ");
                diameter = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Nilai Diameter tidak sesuai\n");                                          
                scanner = new Scanner(System.in);
            }      
        } while (!valid);


        System.out.println("\n=========== Hasil Perhitungan Lingkaran =============");
        System.out.println("Jari jari Lingkaran\t: ".concat(String.valueOf(diameter / 2)));
        System.out.printf("Luas Lingkaran\t\t: %.2f\n", calculateCircleLarge(diameter / 2));        
        System.out.printf("Keliling Lingkaran\t: %.2f\n", calculateCircleSurfaceArea(diameter));
        // TODO hitung diameter
    
    }


    public static double calculateCircleSurfaceArea(int diameter){
        return PHI * diameter;
    }

    public static double calculateCircleLarge(int radius){
        return PHI * (radius * radius);
    }

    
}
