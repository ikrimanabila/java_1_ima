/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.project4;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasProject4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int panjang, tinggi, lebar, LPblk;
         Scanner LPbalok = new Scanner(System.in);
         System.out.println("program luas permukaan balok");
         System.out.println(".....");
         System.out.print("panjang : ");
         panjang=LPbalok.nextInt();
         System.out.print("tinggi : ");
         tinggi=LPbalok.nextInt();
         System.out.print("lebar : ");
         lebar=LPbalok.nextInt();
         LPblk=2*panjang*lebar+2*panjang*tinggi+2*lebar*tinggi;
         System.out.print("luas permukaan balok adalah"+LPblk);
    }
    
}
