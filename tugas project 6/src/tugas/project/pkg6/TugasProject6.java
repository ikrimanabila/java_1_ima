/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.project.pkg6;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasProject6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int waktu; 
        
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("masukan nilai waktu : ");
        waktu=inputan.nextInt();
        //pakai >= atau <= itu pertanda seperti "sampai" lalu "&&" untuk menghubungkan
        
        if (waktu>=5 && waktu<=11)
        {
            System.out.print("pagi");
        }
        else if (waktu>=12 && waktu<=18)
        {
            System.out.print("sore");
        }
        else if (waktu>=19 && waktu<=24)
        {
            System.out.print("malam");
        }
        else if (waktu>=1 && waktu<=4)
        {
           System.out.print("dinihari");
        }else {System.out.print("pilihan tidak tersedia");}
        }
}


