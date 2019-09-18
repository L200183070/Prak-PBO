/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor1;
/**
 *
 * @author ASUS
 */
public class animal {
    String nama;
    int kaki;
    String makanan;
    String type;
    
    void beriNama (String Harimau){
        nama = Harimau;
    }
    void beriKaki (int x){
        kaki = x;
    }
    void jenisMakanan (String Daging){
        makanan = Daging;
    }
    void typeHewan (String Karnivora){
        type = Karnivora;
    }
    void infoHewan(){
        System.out.println (
            "Nama Hewan : " + nama + "\n" +
            "Jumlah Kaki : " + kaki + "\n" +
            "Jenis Makanan :" + makanan + "\n" +
            "Type Hewan : " + type + "\n"
            );
    }
}
