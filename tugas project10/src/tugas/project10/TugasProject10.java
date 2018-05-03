/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.project10;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasProject10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama,kode_kota,jk;
        Scanner inputan = new Scanner(System.in);
        System.out.println("............");
       
        for(int i=1;i<4;i++)
        {
            System.out.println("data peserta ke-"+i);
            System.out.print("masukan nama peserta : ");
            nama=inputan.nextLine();
            System.out.print("masukan kode kota : ");
            kode_kota=inputan.nextLine();
            System.out.print("masukan jenis kelamin : ");
            jk=inputan.nextLine();
            System.out.println(nama+"berasal dari kota"+kode_kota+"dan berjeniis kelamin"+jk);
    }
    
}
}
