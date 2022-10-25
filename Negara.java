/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak302;

import java.util.HashMap;

public class Negara {
    private HashMap<Integer, String> bulan=new HashMap<Integer, String>();
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalMerdeka;
    private Integer bulanMerdeka;
    private int tahunMerdeka;

    public Negara(String nama,String jenisKepemimpinan,String namaPemimpin,int tanggalMerdeka,int bulanMerdeka,int tahunMerdeka){
        this.nama=nama;
        this.jenisKepemimpinan=jenisKepemimpinan;
        this.namaPemimpin=namaPemimpin;
        this.tanggalMerdeka=tanggalMerdeka;
        this.bulanMerdeka=bulanMerdeka;
        this.tahunMerdeka=tahunMerdeka;
        initialBulan();
    }
    public Negara(String nama,String jenisKepemimpinan,String namaPemimpin){
        this.nama=nama;
        this.jenisKepemimpinan=jenisKepemimpinan;
        this.namaPemimpin=namaPemimpin;
        initialBulan();
    }
    private void initialBulan(){
        this.bulan.put(1, "Januari");
        this.bulan.put(2, "Februari");
        this.bulan.put(3, "Maret");
        this.bulan.put(4, "April");
        this.bulan.put(5, "Mei");
        this.bulan.put(6, "Juni");
        this.bulan.put(7, "Juli");
        this.bulan.put(8, "Agustus");
        this.bulan.put(9, "September");
        this.bulan.put(10, "Oktober");
        this.bulan.put(11, "November");
        this.bulan.put(12, "Desember");
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setJenisKepemimpinan(String jenisKepemimpinan){
        this.jenisKepemimpinan=jenisKepemimpinan;
    }
    public void setNamaPemimpin(String namaPemimpin){
        this.namaPemimpin=namaPemimpin;
    }
    public void setTanggalMerdeka(int tanggalMerdeka){
        this.tanggalMerdeka=tanggalMerdeka;
    }
    public void setBulanMerdeka(int bulanMerdeka){
        this.bulanMerdeka=bulanMerdeka;
    }
    public void setTahunMerdeka(int tahunMerdeka){
        this.tahunMerdeka=tahunMerdeka;
    }
    public String getNama(){
        return this.nama;
    }
    public String getJenisKepemimpinan(){
        return this.jenisKepemimpinan;
    }
    public String getNamaPemimpin(){
        return this.namaPemimpin;
    }
    public int getTanggalMerdeka(){
        return this.tanggalMerdeka;
    }
    public int getIntBulanMerdeka(){
        return this.bulanMerdeka.intValue();
    }
    public String getStringBulanMerdeka(){
        return this.bulan.get(this.bulanMerdeka);
    }
    public int getTahunMerdeka(){
        return this.tahunMerdeka;
    }
    public static boolean isMonarki(String jenisKepemimpinan){
        return jenisKepemimpinan.equalsIgnoreCase("monarki");
    }
    public void printDetail(){
        System.out.print("Negara ");
        System.out.print(this.nama);
        System.out.print(" mempunyai ");
        if(isMonarki(this.jenisKepemimpinan)){
            System.out.print("Raja");
        }else{
            System.out.print(this.jenisKepemimpinan);
        }
        System.out.print(" bernama ");
        System.out.print(namaPemimpin+"\n");
        if (isMonarki(this.jenisKepemimpinan)){
            System.out.print("\n");
            return;
        }
        System.out.print("Deklarasi Kemerdekaan pada Tanggal ");
        System.out.print(this.tanggalMerdeka+" ");
        System.out.print(this.getStringBulanMerdeka()+" ");
        System.out.print(this.tahunMerdeka+"\n\n");
    }
}