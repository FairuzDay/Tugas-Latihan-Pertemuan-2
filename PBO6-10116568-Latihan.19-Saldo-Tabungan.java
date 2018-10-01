/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan19.saldotabungan;

/*
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO-6
 * NIM		: 10116568 
 * Description : Saldo Tabungan
 */
public class PBO610116568Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldoAwal = 2500000, month = 6;
        double bankInterest = 0.15;

        for (int i = 1; i<=month; i++){
            saldoAwal += saldoAwal * bankInterest;
            System.out.printf(
                "Saldo di bulan ke-"
                .concat(String.valueOf(i))
                .concat(" Rp.")
                .concat(String.valueOf("%,d\r\n")), 
                saldoAwal);
        }
    }
    
}
