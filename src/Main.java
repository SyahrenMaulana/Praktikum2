/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pohon oke = new Pohon();
        String cemara = oke.setNama();
        String kelapa = oke.setTinggi();
        System.out.println(cemara);
        System.out.println(kelapa);
        
        System.out.println("Nama Pohon :"+oke.getNama());
        System.out.println("Tinggi Pohon :"+oke.getTinggi()+"Meters");
    }
    
}
