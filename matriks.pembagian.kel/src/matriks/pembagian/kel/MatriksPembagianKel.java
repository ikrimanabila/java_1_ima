/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriks.pembagian.kel;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class MatriksPembagianKel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int matriks_a[][]=new int[2][2];
        int matriks_b[][]=new int[2][2];
        
        Scanner input_matriks=new Scanner(System.in);
        
         System.out.println("input matriks A");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print("masukan angka untuk matriks A ["+i+"] ["+j+"] : ");
                matriks_a[i][j]=input_matriks.nextInt();
            }
        }
        System.out.println();
        
        System.out.println("input matriks B");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print("masukan angka untuk matriks B ["+i+"] ["+j+"] : ");
                matriks_b[i][j]=input_matriks.nextInt();
            }
        }
        System.out.println();
        
        int hasil_pembagian[][]=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                int hasil=0;
                for(int k=0;k<2;k++){
                    hasil+=matriks_a[i][k]/matriks_b[k][j];
                }
                hasil_pembagian[i][j]=hasil;
            }
        }
        System.out.println();
        System.out.println("matriks A / matriks B");
        for(int i=0;i<2;i++){
            System.out.print("[");
            for(int j=0;j<2;j++){
               System.out.print(hasil_pembagian[i][j]+" ");
            }
            System.out.println("]");
        }
    }
    
}
