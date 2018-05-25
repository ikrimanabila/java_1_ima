/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa_nilai;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
class mahasiswanilai {
    String nomor_mahasiswa,nama_mahasiswa,kelas,semester,nilai_pemograman,nilai_database,nilai_design,nilai_algoritma,nilai;
    int nilaimhswa,nilaiprgm,nilaidata,nilaidsgn,nilaialgo;
    double jumlah_nilai,ratarata;
     Scanner input = new Scanner(System.in);

public mahasiswanilai(){
    nomor_mahasiswa="";
    nama_mahasiswa="";
    kelas="";
    semester="";
    nilai_pemograman="";
    nilai_database="";
    nilai_design="";
    nilai_algoritma="";
    nilai="";
    nilaimhswa=0;
    nilaiprgm=0;
    nilaidata=0;
    nilaidsgn=0;
    nilaialgo=0;
    jumlah_nilai=0.0;
    ratarata=0.0;
}

public void input(){
        System.out.println("selamat datang di program nilai mahasiswa");
        System.out.println("=========================================");
        System.out.println("masukkan data anda");
        System.out.print("masukkan nomer mahasiswa : ");
        nomor_mahasiswa= input.nextLine();
        System.out.print("masukkan nama mahasiswa : ");
        nama_mahasiswa= input.nextLine();
        System.out.print("masukkan kelas : ");
        kelas= input.nextLine();
        System.out.print("masukkan semester : ");
        semester= input.nextLine();
        System.out.print("masukkan nilai pemograman [A/B/C/D/E] : ");
        nilai_pemograman= input.nextLine();
        System.out.print("masukkan nilai database [A/B/C/D/E] : ");
        nilai_database= input.nextLine();
        System.out.print("masukkan nilai design [A/B/C/D/E] : ");
        nilai_design= input.nextLine();
        System.out.print("masukkan nilai algoritma [A/B/C/D/E] :  ");
        nilai_algoritma= input.nextLine();
}

public String ifelse_nilai(){

            if("A".equals(nilai_pemograman))
                { 
                 nilaiprgm=4;
                }
            else if("B".equals(nilai_pemograman))
                {   
                    nilaiprgm=3;
                }
             else if("C".equals(nilai_pemograman))
                {   
                    nilaiprgm=2;
                }
             else if("D".equals(nilai_pemograman))
                {   
                    nilaiprgm=1;
                }
            else if("E".equals(nilai_pemograman))
            {
                nilaiprgm=0;
            }
                
if("A".equals(nilai_database))
                { 
                 nilaidata=4;
                }
            else if("B".equals(nilai_database))
                {   
                    nilaidata=3;
                }
             else if("C".equals(nilai_database))
                {   
                    nilaidata=2;
                }
             else if("D".equals(nilai_database))
                {   
                    nilaidata=1;
                }
            else if("E".equals(nilai_database))
            {
                nilaidata=0;
            }
                
if("A".equals(nilai_design))
                { 
                 nilaidsgn=4;
                }
            else if("B".equals(nilai_design))
                {   
                    nilaidsgn=3;
                }
             else if("C".equals(nilai_design))
                {   
                    nilaidsgn=2;
                }
             else if("D".equals(nilai_design))
                {   
                    nilaidsgn=1;
                }
            else if("E".equals(nilai_design))
            {
                nilaidsgn=0;
            }
                
if("A".equals(nilai_algoritma))
                { 
                 nilaialgo=4;
                }
            else if("B".equals(nilai_algoritma))
                {   
                    nilaialgo=3;
                }
             else if("C".equals(nilai_algoritma))
                {   
                    nilaimhswa=2;
                }
             else if("D".equals(nilai_algoritma))
                {   
                    nilaialgo=1;
                }
            else if("E".equals(nilai_algoritma))
                    {
                nilaialgo=0;
                    }
        return null;
}

public double jumlahnilai(){
    int nilai_pemograman=nilaiprgm;
    int nilai_database=nilaidata;
    int nilai_design=nilaidsgn;
    int nilai_algoritma=nilaialgo;
        jumlah_nilai=((nilai_pemograman*4)+(nilai_database*3)+(nilai_design*1)+(nilai_algoritma*2));
        return (jumlah_nilai);
}

public double rata_rata(){
        ratarata=jumlah_nilai / 10;
        return (ratarata);
}

public void output () {
        ifelse_nilai();
    System.out.println("=========================================");
        System.out.println("nomer mahasiswa : "+nomor_mahasiswa);
        System.out.println("nama mahasiswa : "+nama_mahasiswa);
        System.out.println("kelas : "+kelas);
        System.out.println("semester : "+semester);
        jumlahnilai();
        rata_rata();
        System.out.println("jumlah nilai : "+jumlahnilai());
        System.out.println("rata-rata : "+rata_rata());
        System.out.println("=========================================");
    }
}

public class Mahasiswa_nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mahasiswanilai nm=new mahasiswanilai();
        nm.input();
        nm.output();
    }
    
}
