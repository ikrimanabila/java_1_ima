/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_function2;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
class nilai{
    int nim,n_pem,np1,np2,total;
    String nama,mutu;
    
    //contructor
    public nilai(){
        n_pem=0;
        nim=0;
        np1=0;
        np2=0;
        total=0;
        nama="";
        mutu="";
    }
    
    //procedure input
public void input(){
    Scanner input=new Scanner(System.in);
        System.out.print("masukan nama : ");
        nama=input.nextLine();
        System.out.print("masukan nomer induk mahasiswa : ");
        nim=input.nextInt();
        System.out.print("masukan nilai pembimbing : ");
        n_pem=input.nextInt();
        System.out.print("masukan nilai penguji 1 : ");
        np1=input.nextInt();
        System.out.print("masukan nilai penguji 2 : ");
        np2=input.nextInt();
}

//function total
public int total(){
    total=(n_pem*40/100)+(np1*30/100)+(np2*30/100);
    return(total);
}

//function nilai mutu
public void nimut(){
    if(total>=81 && total<=100){
        mutu="grade A";
    }
    else if(total>=71 && total<=80){
        mutu="grade B";
    }
    else if(total>=61 && total<=70){
        mutu="grade C";
    }
    else if(total<=60){
        mutu="tidak ada nilai mutu";
    }
}
//prosedure output
public void output(){
    System.out.println("================================");
System.out.println("nama : "+nama);
        System.out.println("nim : "+nim);
        System.out.println("nilai pembimbing : "+n_pem);
        System.out.println("nilai penguji 1 : "+np1);
        System.out.println("nilai penguji 2 : "+np2);
        System.out.println("total : "+total());
        System.out.println("huruf mutu : "+mutu);
            System.out.println();
}
}

//program utama
public class Tugas_function2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nilai all_nilai=new nilai();
        all_nilai.input();
        all_nilai.total();
        all_nilai.nimut();
        all_nilai.output();
    }
    
}
