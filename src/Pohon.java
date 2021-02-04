
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Pohon {
    String nama, tinggi;
    Scanner input = new Scanner (System.in);
    String setNama(){        
        System.out.println("Masukan Nama Pohon :");
        nama = input.nextLine();
        return "";
        
    }
    
    String setTinggi(){
        System.out.println("Masukan Tinggi Pohon (Meters) :");
        tinggi = input.nextLine();
        return "=========";
    }
    
    String getNama(){
        return nama;
    }
    
    String getTinggi(){
        return tinggi;
    }
}
