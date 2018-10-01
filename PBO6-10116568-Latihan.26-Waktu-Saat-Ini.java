/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO-6
 * NIM		: 10116568 
 * Description : Waktu saat ini
 */
public class PBO610116568Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMM yyyy hh:mm:ss");
        System.out.println(sdf.format(new Date()));      
    }
    
}
