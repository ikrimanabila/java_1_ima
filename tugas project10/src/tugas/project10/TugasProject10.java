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
            System.out.print("masuka kode kota [B/D/E] : ");
            kode_kota=inputan.nextLine();
            System.out.print("masukan jenis kelamin [L/P] : ");
            jk=inputan.nextLine();
            System.out.print(nama);
            
            switch (kode_kota){
                case "B":
                System.out.print("berasal dari jakarta");
                break;
                case "D":
                System.out.print("berasal dari bandung");
                break;
                case "E":
                System.out.print("berasal dari cirebon");
                break; 
                default:
                System.out.print("berasal dari kota tidak tersedia");
                break;
    }
            switch (jk){
            case "P":
                System.out.print("dan berjenis kelamin perempuan");
                break;
            case "L":
                System.out.print("dan berjenis kelamin laki-laki");
                break;
            default:
                System.out.print("dan jenis kelamin anda tidak terdeteksi");
                break;
           
            }
            System.out.println();
}
}
}