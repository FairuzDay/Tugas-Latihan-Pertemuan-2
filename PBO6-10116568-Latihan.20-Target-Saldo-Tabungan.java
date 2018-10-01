/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116569.latihan20.targetsaldotabungan;

/*
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO-6
 * NIM		: 10116568 
 * Description : Target Saldo Tabungan
 */
public class PBO610116569Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldoAwal = 3500000, index = 0;
        double bankInterest = 0.08;
        
        do{
            index += 1;
            saldoAwal += saldoAwal * bankInterest;
            System.out.printf(
                "Saldo di bulan ke-"
                .concat(String.valueOf(index))
                .concat(" Rp.")
                .concat(String.valueOf("%,d\r\n")), 
                saldoAwal);

        } while (saldoAwal < 6000000);
    }
    
}
