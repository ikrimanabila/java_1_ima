/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.project8;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasProject8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jp,pesanan,harga = 0,total;
        String nama_pesanan = null;
        Scanner inputan = new Scanner(System.in);
        System.out.println("menu : ");
        System.out.println("1.kopi");
        System.out.println("2.teh");
        System.out.println("3.air mineral");
        System.out.print("pesan menu no : ");
        pesanan=inputan.nextInt();
        System.out.print("jumlah pesanan : ");
        jp=inputan.nextInt();
        switch (pesanan){
            case 1 :
                nama_pesanan="kopi";
                harga=25000;
                break;
            case 2 :
                nama_pesanan="teh";
                harga=15000;
                break;
            case 3 :
                nama_pesanan="air mineral";
                harga=10000;
                break;
            default:
                System.out.print("maaf silahkan input ulang pesanan anda");
                break;
        }
        if (pesanan>=1 && pesanan<=3){
            total=harga*jp;
            System.out.print("silahkan membayar Rp"+total);
            System.out.print("terimakasih anda telah memesan"+nama_pesanan+"sebanyak"+ jp+"gelas, silahkan tunggu pesanan anda");
        }
    }
    }

