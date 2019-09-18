/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;
import java.util.Date;
/**
 *
 * @author ASUS
 */
public class dosen {
   String nama;
   int nik;
   String pendidikan;
   Date tglLahir;
   
   void tampilkanNama (String aku){
       nama = aku;
   }
   void tampilkanTglLahir (Date angka1){
      tglLahir  = angka1;
   }
   void tampilkanNik (int angka){
       nik = angka;
   }
   
   void infodosen(){
       System.out.println (
       "nama : " + nama + "\n" +
       "nik : " + nik + "\n" +
       "pendidikan : " + pendidikan + "\n" +
       "tglLahir : " + tglLahir + "\n" );
   }
   public static void main(String[] args) {
        dosen a = new dosen();
        a.tampilkanNama("Aulia");
        a.tampilkanNik(12345);
        a.tampilkanTglLahir(8);
        a.infodosen();
   }
}
