/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak301;

import java.util.LinkedList;
import java.util.Scanner;


public class PRAK301 {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        LinkedList<Dadu> semuaDadu=new LinkedList<Dadu>();
        
        System.out.print("Masukkan Jumlah Dadu yang akan dimainkan: ");
        int n=input.nextInt();
        int jumlah=0;
        System.out.println("=======");
        
        for(int i=0;i<n;i++){
            semuaDadu.add(new Dadu());
            semuaDadu.getLast().acakNilai();
            //System.out.println(semuaDadu.getLast().getValue());
            
        }
        for(int i=0;i<semuaDadu.size();i++){
            System.out.println("Dadu ke-"+(i+1)+" bernilai "+semuaDadu.get(i).getValue());
            jumlah+=semuaDadu.get(i).getValue();
        }
        System.out.println("Total nilai dadu keseluruhan "+jumlah);
        input.close();
    }
}
