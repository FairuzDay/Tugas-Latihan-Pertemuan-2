/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan28.gantikata;

import java.util.Scanner;

/*
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO-6
 * NIM		: 10116568 
 * Description : Ganti kata
 */
public class PBO610116568Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String sentence, oldWord, newWord;

        System.out.print("Masukan Kalimat\t: ");
        sentence =  scanner.nextLine();
        
        System.out.print("Ganti kata : ");
        oldWord =  scanner.nextLine();

        System.out.print("Menjadi kata : ");
        newWord =  scanner.nextLine();

        System.out.println("\n\n====================== Hasil Formatting ======================");
        System.out.println("Kalimat Awal\t: ".concat(sentence));
        System.out.println("Kalimat Akhir\t: ".concat(sentence.replaceAll(oldWord,newWord)));
    }
    
}
