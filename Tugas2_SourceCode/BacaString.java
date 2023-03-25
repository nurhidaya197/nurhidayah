/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bacastring;

/**
 * Nama:Nurhidayah Mnasyur
 * Stambuk:13020210197
 * tanggal:18-03-2023
 * jam:11:45
 */
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
public class BacaString {

    /**
    * @param args
    * @throws IOException
    */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        /*Kamus*/
        String str;

        BufferedReader datAIn = new BufferedReader(new InputStreamReader (System.in));
        /* Program */

        System.out.print ("\nBaca string dan Integer : \n");

        System.out.print ("masukkan sebuah string : ");

        str= datAIn.readLine();

        System.out.print ("String yang dibaca : "+ str);

    }

}
