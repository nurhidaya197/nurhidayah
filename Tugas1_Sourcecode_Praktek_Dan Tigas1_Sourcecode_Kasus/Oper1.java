/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oper1;

/**
 * Nama:Nurhidayah Masyur
 * Stambuk:13020210197
 * Tanggal:senin-06-3-2023
 * Jam:21:36
 */
public class Oper1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* KAMUS */
        int n = 10; /* 1010 */
        int x = 1; /* 1 */
        int y = 2; /* 10 */
        /* ALGORITMA */
        System.out.println ("n = "+ n);
        System.out.println ("x = "+ x);
        System.out.println ("y = "+ y);
        System.out.println("n & 8 = "+ (n & 8)); /* 1010 AND 1000 */
        System.out.println ("x & ~ 8 = "+ (x & ~8)); /* 1 AND 0111 */ 
        System.out.println ("y << 2 = "+ (y << 2)); /*10==> 1000 = 8 */ 
        System.out.println ("y >> 3 = "+ (y >>3)); /*10 ==>0000 = 0 */
   
   }

}
