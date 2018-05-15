/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.kelompok;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasKelompok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jnt=0,rt = 0,nilai_mhs,total=0;
        String akr = null;
       
        Scanner inputan = new Scanner(System.in);
        System.out.println("............");
        System.out.println("program nilai");
        System.out.println("............");
        
        int nilai=1;
         do{
           System.out.print("nilai mahasiswa ke-"+nilai+": ");  
           nilai_mhs=inputan.nextInt();
           nilai++;
           total+=nilai_mhs;
           rt=total/10;
            
         }while(nilai<11);
         
          if (rt>85){
            akr="grade A";
        }
        else if (rt>70){
            akr="grade B";
        }
        else if (rt>50){
           akr="grade BAN-PT";
        }
        else if (rt<=50){
           akr="grade tidak terakreditasi";
        }else {System.out.print("tidak tersedia");
        }
             
           System.out.println("jumlah nilai total = "+total);
           
           System.out.println("nilai rata-rata = "+rt);
          
           System.out.println("akreditas = "+akr);
         
           System.out.println();
           
           
            
      }
    }

