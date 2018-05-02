/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.project9;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasProject9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jk,jrsn,total,harga = 0;
        String nama,nama_jurusan=null;
        Scanner inputan = new Scanner(System.in);
        System.out.println("jurusan : ");
        System.out.println("1.BSD - Bandung");
        System.out.println("2.Bandung - BSD");
        System.out.print("nama pemesan : ");
        nama=inputan.nextLine();
        System.out.print("pesan jml kursi : ");
        jk=inputan.nextInt();
        System.out.print("jurusan : ");
        jrsn=inputan.nextInt();
        switch (jrsn){
            case 1 :
                nama_jurusan ="BSD - Bandung";
                harga=70000;
                break;
            case 2 :
                nama_jurusan="Bandung - BSD";
                harga=50000;
                break;
            default:
                System.out.print("maaf silahkan input ulang pesanan anda");
                break;
        }
       {
           if (jrsn>=1 && jrsn<=2){
            total=harga*jk;
            System.out.print("tiket telah dipesan oleh"+nama+"jurusan"+nama_jurusan+"dengan jumlah"+jk+"tiket dengan total bayar yaitu Rp"+total);
    }
    }
}
}