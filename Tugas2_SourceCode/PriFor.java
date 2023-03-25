/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prifor;

/**
 * Nama:nurhidayah mansyur
 * stambuk:13020210197
 * tanggal:18-03-2023
 * jam:21:00
 */
import java.util.Scanner;
public class PriFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        int i,N;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        /* program */
        System.out.print ("Baca N, print 1 s/d N ");
        System.out.print ("N = ");
        N=masukan.nextInt();
        for (i = 1; i <= N; i++){
        System.out.println (i); }
        System.out.println ("Akhir program \n");
    }
}
