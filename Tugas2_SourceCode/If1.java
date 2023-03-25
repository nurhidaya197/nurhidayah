/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if1;

/**
 * Nama:nurhidayah manyur
 * stambuk:13020210197
 * tanggal:18-03-2023
 * jam:16:40
 */
import java.util.Scanner;
public class If1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated methode stub
        /* Kmaus */
        Scanner masukan=new Scanner(System.in);
        int a;
        /*Program*/

        System.out.print ("Contoh IF satu kasus \n ");
        System.out.print ("Ketikkan suatu nilai integer : ");
        a = masukan.nextInt();
        if ( a>= 0 )
            System.out.print ("\nNilai a positif "+ a);

    }

}
