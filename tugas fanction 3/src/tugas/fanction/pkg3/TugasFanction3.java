/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.fanction.pkg3;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
class travel{
    int bt,ac,na,harga,total,kembalian,uang;
    String nama,jrsn,jenis,ulang;
    
    //contructor
    public travel(){
        bt=0;
        ac=0;
        na=0;
        harga=0;
        total=0;
        kembalian=0;
        uang=0;
        nama="";
        jrsn="";
        jenis="";
        ulang="";
    }
    
    //procedure input
public void input(){
    Scanner input=new Scanner(System.in);
   /* for (int i=1;i<=3;i++)
        {        
       System.out.println ("Data pemesanan tiket ke-"+i);*/
    System.out.println("=======================================");
    System.out.println("          =         jenis              ");
    System.out.println("jurusan   =   AC    =====    Non AC    ");
    System.out.println("=======================================");
    System.out.println("banten    = 90.000  =====   70.000   = ");
    System.out.println("semarang  = 85.000  =====   60.000   = ");
    System.out.println("jogja     = 60.000  =====   40.000   = ");
    System.out.println("=======================================");
    
        System.out.print("nama pemesan : ");
        nama=input.nextLine();
        System.out.print("jurusan : ");
        jrsn=input.nextLine();
        System.out.print("jenis : ");
        jenis=input.nextLine();
        System.out.print("banyak tiket : ");
        bt=input.nextInt();
        }

//function jurusan
public void jurusan(){
         switch(jrsn){
            case "banten":
                if ("na".equals(jenis))
                {
                harga=70000;
                }
               else if ("ac".equals(jenis)) 
                {
                harga=90000;
                } 
                break;
            case "semarang": 
                if ("na".equals(jenis))
                {
                harga=60000;
                }
               else if ("ac".equals(jenis)) 
                {
                harga=85000;
                } 
                break;
            case "jogja": 
                if ("na".equals(jenis))
                {
                harga=40000;
                }
               else if ("ac".equals(jenis)) 
                {
                harga=60000;
                } 
                break;
            default:
                jrsn="Maaf silahkan input ulang";
                break;
        }
}

//function total
public int total(){
    total=harga*bt;
    return(total);
}
//procedure jumlah uang
public void jml_uang(){
    Scanner inpt=new Scanner(System.in);
    System.out.println("Harga satuan untuk jurusan" +jrsn+ "adalah" +harga);
    System.out.println("=======================================");
    System.out.println(nama+"harus membayar sebesar : " +total);
    System.out.print("masukan jumlah uang       : ");
    uang=inpt.nextInt();
    System.out.println("=======================================");
}

//function kembalian
public int kembalian(){
    kembalian=uang-total;
    return(kembalian);
}

public void output(){
    System.out.println("=======================================");
    System.out.println("kembalian                : "+kembalian);
    System.out.println("=======================================");
    System.out.println ("");
}
}

//program utama
public class TugasFanction3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ulang;
         Scanner input=new Scanner(System.in);
        do{
        travel jr=new travel();
        jr.input();
        jr.jurusan();
        jr.total();
        jr.jml_uang();
        jr.kembalian();
        jr.output();
            System.out.print("ulang lagi [Y/N]           : ");
              ulang=input.nextLine();
        }
        while("Y".equals(ulang));
    }
  
}
