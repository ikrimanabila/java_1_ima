/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.project3;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasProject3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int panjang, lebar, tinggi, volume;
         Scanner balok = new Scanner(System.in);
         System.out.println("program volume balok");
         System.out.println(".....");
         System.out.print("panjang : ");
         panjang=balok.nextInt();
         System.out.print("lebar : ");
         lebar=balok.nextInt();
         System.out.print("tinggi : ");
         tinggi=balok.nextInt();
         volume=panjang*lebar*tinggi;
         System.out.print("volume balok adalah"+volume);
    }
    
}
