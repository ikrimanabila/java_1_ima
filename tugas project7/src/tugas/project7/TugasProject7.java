/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.project7;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasProject7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kp;
        Scanner inputan = new Scanner(System.in);
        System.out.print("kode plat [B/D/E] : ");
        kp=inputan.nextLine();
        if ("B".equals(kp)||"b".equals(kp)){
            System.out.print("selamat datang mobil dari wilayah jakarta");
        }
        else if ("D".equals(kp)||"d".equals(kp)){
            System.out.print("selamat datang mobil dari wilayah bandung");
        }
        else if ("E".equals(kp)||"e".equals(kp)){
            System.out.print("selamat datang mobil dari wilayah cirebon");
        }
        else {
            System.out.print("maaf daftar kota tidak tersedia");
        }
    }
    
}
