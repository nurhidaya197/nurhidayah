/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if2;

/**
 * nama:Nurhidayah Mnaysur
 * stambuk:13020210197
 * tanggal:18-03-2023
 * jam:17:28
 */
import java.util.Scanner;
public class If2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        int a;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Contoh IF dua kasus \n");
        System.out.print ("Ketikkan suatu nilai integer :");
        a=masukan.nextInt();
        if (a >= 0){
        System.out.println ("Nilai a positif "+ a);
        }else /* a< 0 */
    {
        System.out.println ("Nilai a negatif "+ a);
       }
    }
}
