/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printxinterasi;

/**
 * Nama:nurhidayah mansyur
 * stambuk:13020210197
 * tanggal:18-03-2023
 * jam:00:12
 * 
 */
import java.util.Scanner;
public class PrintXinterasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int Sum=0; int x;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Masukkan nilai x (int), akhiri dg 999: ");
        x = masukan.nextInt(); 
        /* First Elmt */
        if (x == 999){
        System.out.print ("Kasus kosong \n");
        }else{ 
        /* MInimal ada satu data yang dijumlahkan*/
        Sum = x;
        /* Inisialisasi; invariant !! */
        for (;;){
        System.out.print ("Masukkan nilai x (int),akhiri dg 999 : ");
        x = masukan.nextInt();
        /* Next Elmt */
        if(x==999)
        break;
        else{
        Sum = Sum + x; 
        /* Proses */
       }
    }
}
       System.out.println("Hasil penjumlahan = "+ Sum);
       /* Terminasi */
    }
}
