/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan17.programtunjangan;

import java.util.Scanner;

/**
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO-6
 * NIM		: 10116568
 * Description : Program Tunjangan
 */
public class PBO610116568Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double gaji;
        boolean isMarried = false;

        System.out.println("=============== Program Tunjangan ===============");
        System.out.print("Berapa gaji pokok anda perbulan?\t: ");
        gaji = Double.parseDouble(scanner.nextLine());
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        isMarried = (scanner.nextLine()).equalsIgnoreCase("menikah");
        

        System.out.println("\n\n========= Hasil Penghitungan Gaji Anda ==========");
        System.out.println("Gaji Pokok\t\t\t: Rp ".concat(String.valueOf(gaji)));
        System.out.println("Tunjangan\t\t\t: Rp ".concat(String.valueOf(gaji * (isMarried ? 0.35 : 0) )));
        System.out.println("Total Gaji\t\t\t: Rp ".concat(String.valueOf(gaji + (gaji * (isMarried ? 0.35 : 0)) )));
        System.out.println("\n\n");
        
    
    }
    
}
