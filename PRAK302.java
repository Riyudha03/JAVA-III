/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak302;

import java.util.LinkedList;
import java.util.Scanner;

public class PRAK302 {
    
    static Scanner input=new Scanner(System.in);
    
    public static void main(String[] args) {
        
        LinkedList<Negara> semuaNegara=new LinkedList<Negara>();
        int n;
        System.out.print("Masukkan Negara Yang Ingin Dikenalkan: ");
        n=input.nextInt();
        input.nextLine();
        
        for(int i=0;i<n;i++){
            semuaNegara.add(inputNegara());    
        }
        while(!semuaNegara.isEmpty()){
            semuaNegara.poll().printDetail();
        }
        input.close();
    }
    
    public static Negara inputNegara(){
        
        String nama;
        String jenisKepemimpinan;
        String namaPemimpin;
        int tanggalMerdeka;
        int bulanMerdeka;
        int tahunMerdeka;
        System.out.print("Masukkan Nama Negara: ");
        nama=input.nextLine();
        System.out.print("Masukkan Pemerintahan Negara: ");
        jenisKepemimpinan=input.nextLine();
        System.out.print("Masukkan Nama Pemimpin: ");
        namaPemimpin=input.nextLine();
        
        if(Negara.isMonarki(jenisKepemimpinan)){
            return new Negara(nama, jenisKepemimpinan, namaPemimpin);
        }
        System.out.print("Masukkan Tanggal Kemerdekaan: ");
        tanggalMerdeka=input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Bulan Kemerdekaan: ");
        bulanMerdeka=input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Tahun Kemerdekaan: ");
        tahunMerdeka=input.nextInt();
        input.nextLine();
        
        return new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalMerdeka, bulanMerdeka, tahunMerdeka);
    }  
}
