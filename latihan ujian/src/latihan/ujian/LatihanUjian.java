/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.ujian;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
class toko{
    int status,jumlah,harga,kuantitas, bayar, kembali;
    String  nama,barang,kode_barang,stts_anggota;
    Scanner input = new Scanner(System.in);
    
    public toko(){
        nama="";
        kode_barang="";
        stts_anggota="";
        barang="";
        status=0;
        jumlah=0;
        harga=0;
        kuantitas=0;
        bayar=0;
        kembali=0;
    }
    
     public void input(){
        
        System.out.print("Nama : ");
        nama= input.nextLine();
        System.out.print("status [Member/Non] : ");
        stts_anggota= input.nextLine();
        System.out.print("pembelian barang [Kulkas/Tv/Motor] : ");
        barang= input.nextLine();
        System.out.print("kuantitas : ");
        kuantitas= input.nextInt();
    }
     
    public int hrg(){
        switch(barang){
            case "Kulkas":
            if ("Non".equals(stts_anggota))
                { 
                 harga=3500000;
                }
            else if("Member".equals(stts_anggota))
                {   harga=3500000-3500000*10/100;
                }
            break;
            case "Tv" :
                if ("Non".equals(stts_anggota))
                {
                    harga=2100000;
                    }
                else if("Member".equals(stts_anggota))
                {   harga=2100000-2100000*10/100;
                    }     
            break;
            case "Motor" :
                if ("Non".equals(stts_anggota))
                {
                    harga=15000000;
                    }
                else if ("Member".equals(stts_anggota))
                {   harga=15000000-15000000*10/100;
                    }
            break;
            default :
                harga=0;
            break;
        }
        return harga;
    }
    
    public int total(){
    switch(stts_anggota){
            case "Member" :
         jumlah=harga*kuantitas;
                break;
            case "Non":
                jumlah=harga*kuantitas;
                break;
    }
        return jumlah;
    }

public void output(){
        hrg();   
        total();
        System.out.println("total : "+jumlah);
        input_bayar();
        System.out.println("kembalian"+kembalian());
        System.out.println("terimakasih telah membeli");
    }
    
 
    public void input_bayar(){
        System.out.print("bayar : ");
        bayar= input.nextInt();
    } 
    
    public int kembalian(){
        kembali = bayar-jumlah; 
        return kembali;
    }
    
}
    
public class LatihanUjian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         toko tk = new toko();
            tk.input();
            tk.hrg();
            tk.total();
            tk.output();
    }
    
}
