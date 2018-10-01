/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan25.ejaannama;

import java.util.Scanner;

/*
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO-6
 * NIM		: 10116568 
 * Description : Program Ejaan Nama
 */

public class PBO610116568Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);        
        String nama;

        System.out.println("\n======== Program Perbandungan Nilai ========\n\n");
        System.out.print("Masukan Nama depan anda untuk di eja : ");
        nama = scanner.nextLine();
        
        System.out.println("\n\nEjaan untuk \"".concat(nama).concat("\" adalah :"));

        for (int i = 0; i < nama.length(); i++) {
            System.out.println(
                "Huruf ke-"
                .concat(String.valueOf(i + 1))
                .concat(" : ")
                .concat(String.valueOf(nama.charAt(i)))
                );
        }
    }
    
}
