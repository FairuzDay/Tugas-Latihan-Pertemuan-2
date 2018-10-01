/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan30.cakep;

import java.util.Scanner;

/*
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO-6
 * NIM		: 10116568 
 * Description : CAKEP 
 */
public class PBO610116568Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
     public static final int TRANSPARENT = 0;
    public static final int BLACK = 30;
    public static final int RED = 31;
    public static final int GREEN = 32;
    public static final int YELLOW = 33;
    public static final int BLUE = 34;
    public static final int PURPLE = 35;
    public static final int CYAN = 36;
    public static final int WHITE = 37; 
    public static void main(String[] args) {
        // TODO code application logic here
        String option;
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("\n"
            .concat(colorBuilder(RED, TRANSPARENT, "Kamu"))
            .concat(colorBuilder(GREEN, TRANSPARENT, "Ngerjain sendiri"))
            .concat(colorBuilder(YELLOW, TRANSPARENT, "latihan 17 sampe"))
            .concat(colorBuilder(BLUE, TRANSPARENT, "latihan 30 ini?"))            
        );


        System.out.print(""
            .concat(colorBuilder(BLUE, TRANSPARENT, "Jawab"))
            .concat(colorBuilder(RED, TRANSPARENT, "(Yoi/Enggak) :"))
        );        
        option = scanner.nextLine();

        if (option.equalsIgnoreCase("yoi")){
            System.out.println("\n\n"
                .concat(colorBuilder(RED, TRANSPARENT, "Cakep Bener."))
                .concat(colorBuilder(PURPLE, TRANSPARENT, "Good Job"))
            );
        } else {
            System.out.println("\n\n"
                .concat(colorBuilder(RED, TRANSPARENT, " Tetep Cakep sih.\n"))
                .concat(colorBuilder(CYAN, TRANSPARENT, "Sing penting paham konsep nya yee.\n"))
                .concat(colorBuilder(TRANSPARENT, TRANSPARENT, "Keep the code works dude\n"))                
            );
        }
        
    }

    public static String colorBuilder(int foreground, int background, String text){
        return "\033[" + foreground + ";" + (background + 10) + ";1m".concat(text).concat("\033[" + TRANSPARENT + ";" + (TRANSPARENT) + ";1m ");
    }
    
}
