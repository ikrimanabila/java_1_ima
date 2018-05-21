/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_function;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
class gaji{
    int golongan,nip,gp,tunjangan,potongan,gt;
    String nama,gol;
    
    //contructor
    public gaji(){
        golongan=0;
        nip=0;
        gp=0;
        tunjangan=0;
        potongan=0;
        gt=0;
        nama="";
        gol="";
        
    }

    //procedure input
public void input(){
    Scanner input=new Scanner(System.in);
     System.out.print("masukan nomer induk pegawai : ");
        nip=input.nextInt();
        input.nextLine();
        System.out.print("masukan nama : ");
        nama=input.nextLine();
        System.out.print("masukan golongan [1/2/3/4] : ");
        golongan=input.nextInt();


//prosedur if else
switch(golongan){
                 case 1:
                     gp= 2000000;
                     tunjangan=gp*40/100;
                     potongan=40000;
                     break;
                 case 2:
                     gp= 2500000;
                     tunjangan=gp*40/100;
                     potongan=40000;
                     break;
                 case 3:
                     gp= 3000000;
                     tunjangan=gp*50/100;
                     potongan=50000;
                     break;   
                 case 4:
                     gp= 4000000;
                     tunjangan=gp*60/100;
                     potongan=55000;
                     break;     
                 default:
                     System.out.print("Golongan yang diinputkan tidak tersedia");
                     break;
        }
}
//function gaji total
public int gatot(){
    return(gp + tunjangan - potongan);
}
//prosedure output
public void output(){
System.out.println("gaji pokoknya : rp. "+gp);
        System.out.println("besar tunjangan : rp."+tunjangan);
        System.out.println("besar potongan : rp."+potongan);
        System.out.println("gaji total : rp."+gatot());
            System.out.println();
}
}
//program utama
public class Tugas_function {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        gaji ga_tot=new gaji();
        ga_tot.input();
        ga_tot.output();
    }
    
}
