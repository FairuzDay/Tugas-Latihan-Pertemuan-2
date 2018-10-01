/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10116568.latihan29.warnakepribadian;

import java.util.Scanner;

/*
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO-6
 * NIM		: 10116568
 * Description : Program Warna Kepribadian
 */
public class PBO0610116568Latihan29WarnaKepribadian {

    /**
     * @param args the command line arguments
     * 
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
        String selectedColor, name;
        printHeader();

        Scanner scanner = new Scanner(System.in);                        
        System.out.print("PILIH WARNA FAVORITMU\t: ");
        selectedColor = scanner.nextLine();
        System.out.print("NAMA KAMU\t\t: ");
        name = scanner.nextLine();

        System.out.println("\n=========== HASIL TEST KEPRIBADIAN ".concat(name.toUpperCase()).concat(" ==========="));        
        printUserChoose(selectedColor);
    }


    public static void printHeader(){
        System.out.println("\n"+
            colorBuilder(RED, TRANSPARENT, "YUK") + " " +
            colorBuilder(GREEN, TRANSPARENT, "CEK")  + " " +
            colorBuilder(YELLOW, TRANSPARENT, "KEPRIBADIANMU")  + " " +
            colorBuilder(CYAN, TRANSPARENT, "DARI")  + " " +
            colorBuilder(PURPLE, TRANSPARENT, "WARNA")  + " " +
            colorBuilder(BLUE, TRANSPARENT, "FAVORITMU")  + " "
            );

        System.out.println();

        System.out.println(colorBuilder(WHITE, RED,    "          MERAH          "));
        System.out.println(colorBuilder(WHITE, GREEN,  "          HIJAU          "));
        System.out.println(colorBuilder(WHITE, YELLOW, "          KUNING         "));
        System.out.println(colorBuilder(WHITE, BLUE,   "          BIRU           "));
        System.out.println(colorBuilder(WHITE, PURPLE, "          UNGU           "));

        System.out.println();
    }    


    public static void printUserChoose(String option){
        int color = selectColor(option);

        if (color == TRANSPARENT) {
            System.out.println("Warna yang anda pilih tidak ada");
            return;
        }

        System.out.println("Warna Favorit kamu adalah ".concat(colorBuilder(color, TRANSPARENT, option.toUpperCase())));

        switch (color) {
            case RED:
                System.out.println("1. Kamu pemberani");
                System.out.println("2. Kamu pecinta music");
                System.out.println("3. Memiliki rasa nasionalisme");
                System.out.println("4. Memiliki rasa semua harus berjalan sempurna");
                break;
            case GREEN:
                System.out.println("1. Kamu orangnya irit");
                System.out.println("2. Kamu orangnya kalem dan santai");
                System.out.println("3. Mudah Cemburu");
                System.out.println("4. Selalu sabar dalam segala hal");
                break;
            case YELLOW:
                System.out.println("1. Orangnya asik");
                System.out.println("2. Selalu Membantu orang lain");
                System.out.println("3. Selalu semangat di setiap waktu");
                System.out.println("4. Terkadang lupa waktu karena terlalu semangat");
                break;
            case BLUE:
                System.out.println("1. Selalu positif dalam segala keadaan");
                System.out.println("2. Sifatnya Dewasa");
                System.out.println("3. Realistis");
                System.out.println("4. Menjadi perhatian orang lain");
                break;
            case PURPLE:
                System.out.println("1. Romantis");
                System.out.println("2. Pemalu");
                System.out.println("3. Memiliki rasa sayang yang tinggi");
                System.out.println("4. Terlalu khawatir");
                break;                    
        }
    }

    public static int selectColor(String option){
        int color = TRANSPARENT;
        switch (option.toLowerCase()) {
            case "merah":
                color = RED;
                break;
            case "hijau":
                color = GREEN;
                break;
            case "kuning":
                color = YELLOW;
                break;
            case "biru":
                color = BLUE;
                break;
            case "ungu":
                color = PURPLE;
                break;
            default:
                color = TRANSPARENT;
                break;
        }

        return color;
    }

    public static String colorBuilder(int foreground, int background, String text){
        return "\033[" + foreground + ";" + (background + 10) + ";1m".concat(text).concat("\033[" + TRANSPARENT + ";" + (TRANSPARENT) + ";1m");
    }
    
}
