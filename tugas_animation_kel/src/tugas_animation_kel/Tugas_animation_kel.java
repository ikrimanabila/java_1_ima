/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_animation_kel;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Tugas_animation_kel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int h,j,i;
        Scanner input=new Scanner(System.in);
        
        System.out.print("masukan ukuran huruf H : ");
        if(!input.hasNextInt())
        {
            System.out.print("harus angka! tidak bisa diproses");
        }
        else{
            h=input.nextInt();
            
            i=1;
            while(i<=h){
                j=1;
            while(j<=h){ 
                if(i==h/2+1 || j==1 || j==h){
                 System.out.print("*");   
                }
                else {
                  System.out.print(" ");   
                }
                j++;
                
            }     
            
    i++;
        System.out.println();
      
        } }
    }}
    

