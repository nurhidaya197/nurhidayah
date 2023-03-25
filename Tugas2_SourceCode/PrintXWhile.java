/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printxwhile;

/**
 * Nama:nurhidayah mansyur
 * stambuk:13020210197
 * tanggal:19-03-2023
 * jam:01:33
 */
import java.util.Scanner;
public class PrintXWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int Sum;
        int x; Scanner masukan=new Scanner(System.in);
        /* Program */
        Sum = 0;
        /* Inisialisasi */
        System.out.print ("Masukkan nilai x (int), akhiri dg999 : ");
        x = masukan.nextInt();
        /* First Elmt*/
        while (x != 999) 
        /* Kondisi berhenti */ 
        { Sum = Sum + x; 
        /* Proses */
        System.out.print("Masukkan nilai x (int), akhiridg 999 : ");
        x = masukan.nextInt();
        /* First Elmt*/
       }
       System.out.println("Hasil penjumlahan = "+ Sum); 
       /* Terminasi */
    }
}
