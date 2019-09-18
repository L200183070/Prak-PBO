/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;


/**
 *
 * @author ASUS
 */
public class karyawan {
   String nama;
   String alamat;
   String jabatan;
   Double gaji;
   
   void tampilkanNama (String aku){
       nama = aku;
   }
   void tampilkanAlamat (String huruf){
      alamat  = huruf;
   }
   void tampilkanJabatan (String angka1){
       jabatan = angka1;
   }
   void tampilkanGaji( Double x ){
        gaji = x;
   }
   
   void infokaryawan(){
       System.out.println (
       "nama : " + nama + "\n" +
       "alamat : " + alamat + "\n" +
       "jabatan : " + jabatan + "\n" +
       "gaji : " + gaji + "\n" );
   }
    public static void main(String[] args) {
        karyawan b = new karyawan();
        b.tampilkanNama("dadhwu");
        b.tampilkanAlamat("solo");
        b.tampilkanJabatan("SMA");
        b.tampilkanGaji(10.000);
        b.infokaryawan();
    }
}

