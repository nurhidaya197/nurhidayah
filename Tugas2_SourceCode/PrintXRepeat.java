/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printxrepeat;

/**
 * Nama:nurhidayah mansyur
 * stambuk:13020210197
 * tanggal:19-03-2023
 * jam:00:59
 * 
 */
import java.util.Scanner;
public class PrintXRepeat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int Sum;
        int x;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Masukkan nilai x (int), akhiri dg999 : ");
        x = masukan.nextInt(); 
        /* First Elmt */
        if (x == 999){
        System.out.print("Kasus kosong \n");
        }else {
        /* MInimal ada satu data yang dijumlahkan*/
        Sum = 0;
        /* Inisialisasi; invariant !! */
        do{
        Sum = Sum + x; 
        /* Proses */
        System.out.print ("Masukkan nilai x (int), akhiridg 999 : ");
        x = masukan.nextInt();
        /* Next Elmt */
        } while (x != 999);
        /* Kondisi pengulangan */
        System.out.println ("Hasil penjumlahan = "+Sum);
        /* Terminasi */
       }
    }
}
