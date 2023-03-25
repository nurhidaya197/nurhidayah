/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printrepeat;

/**
 * Nama:nurhidayah mansyur
 * stambuk:13020210197
 * tanggal:18-03-2023
 * jam:22:58
 */
import java.util.Scanner;
public class PrintRepeat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Nilai N >0 = ");
        /* Inisialisasi */
        N = masukan.nextInt();
        i = 1;
        /* First Elmt */
        System.out.print ("Print i dengan REPEAT: \n");
        do{
        System.out.print (i+"\n"); /* Proses */ i++; /* Next Elmt */
        }
        while (i <= N); /* Kondisi pengulangan */
    }
}
