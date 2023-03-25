/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printwhile1;

/**
 * Nama:nurhidayah mansyur
 * stambuk:13020210197
 * tanggal:18-03-2023
 * jam:23:51
 * 
 */
import java.util.Scanner;
public class PrintWhile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int N;
        int i = 1;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Nilai N >0 = "); N = masukan.nextInt(); 
        System.out.print ("Print i dengan WHILE (ringkas): \n");
        while (i <= N){
        System.out.println (i++);
        } /* (i > N)*/
    }
}
