/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan27.hurufbesarkecil;

import java.util.Scanner;

/*
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO-6
 * NIM		: 10116568 
 * Description : Huruf besar kecil
 */
public class PBO610116568Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String sentence;

        System.out.print("Masukan Kalimat\t: ");
        sentence =  scanner.nextLine();
        
        System.out.println("\nHuruf Besar : ".concat(sentence.toUpperCase()));
        System.out.println("Huruf Kecil : ".concat(sentence.toLowerCase()));
    }
    
}
