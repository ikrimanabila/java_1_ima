/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.project.pkg5;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasProject5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hari; 
        
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("masukan nilai hari : ");
        hari=inputan.nextInt();
        
       if (hari==1)
        {
            System.out.print("senin");
        }
        else if (hari==2)
        {
            System.out.print("selasa");
        }
        else if (hari==3)
        {
            System.out.print("rabu");
        }
        else if (hari==4)
        {
            System.out.print("kamis");
        }
        else if (hari==5)
        {
            System.out.print("jumat");
        }
        else if (hari==6)
        {
            System.out.print("sabtu");
        }
        else if (hari==7)
        {
            System.out.print("minggu");
        }else {System.out.print("pilihan tidak tersedia");}
    }
}
    
       
    
    

