/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan21.program.rata.rata.nilai;

import java.util.Scanner;

/*
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO-6
 * NIM		: 10116568 
 * Description : Program Rata-Rata Nilai
 */
public class PBO610116568Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        int mahasiswaCount = 0;
        double total = 0.0;
        int[] nilaiMahasiswa;

        System.out.print("Masukan Banyaknya Mahasiswa\t: ");
        mahasiswaCount = scanner.nextInt();

        nilaiMahasiswa = new int[mahasiswaCount];
    
        for(int i = 0; i < mahasiswaCount; i+=1){
            System.out.print(
                "Nilai Mahasiswa ke-"
                .concat(String.valueOf(i + 1))
                .concat(" : ")
            );
            nilaiMahasiswa[i] = scanner.nextInt();
        }

        for (int nilai : nilaiMahasiswa){
            total += nilai;
        }      
        
        double result = total / nilaiMahasiswa.length;
        System.out.printf("\n\nMaka, rata-rata Nilainya adalah %.1f \n", result);
    }

    
}
