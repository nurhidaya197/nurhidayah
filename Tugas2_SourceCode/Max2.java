/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package max2;

/**
 * Nama:nurhidayah mansyur
 * stambuk:13020210197
 * tanggal:18-03-2023
 * jam:21;48
 */
import java.util.Scanner;
public class Max2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        int a, b;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Maksimum dua bilangan : \n");
        System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN :\n");
        a=masukan.nextInt();
        b=masukan.nextInt();
        System.out.println ("Ke dua bilangan : a = "+ a+" b = "+b);
        if (a >= b){
        System.out.println ("Nilai a yang maksimum "+ a);
        }else /* a > b */{
        System.out.println ("Nilai b yang maksimum: "+ b);
       }
    }
}
