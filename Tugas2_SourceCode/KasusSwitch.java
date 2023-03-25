/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kasusswitch;

/**
 * Nama:nurhidayah mansyur
 * stambuk:13020210197
 * tanggal:18-03-2023
 * jam:20:37
 */
import java.util.Scanner;
public class KasusSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        char cc;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Ketikkan sebuah huruf, akhiri dengan RETURN \n"); 
        cc=masukan.next().charAt(0); 
        switch (cc) {
        case 'a': { System.out.print (" Yang anda ketik adalah a\n"); break;}
        case 'u': { System.out.print (" Yang anda ketik adalah u\n"); break;}
        case 'e': { System.out.print (" Yang anda ketik adalah e\n"); break;}
        case 'i': { System.out.print (" Yang anda ketik adalah i\n"); break;}
        case 'o': { System.out.print (" Yang anda ketik adalah o\n"); break;}
        default:System.out.print (" Yang anda ketik adalah huruf mati\n");
      }
    }
}