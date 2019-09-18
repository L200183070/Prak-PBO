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
public class mahasiswa {
   String nama;
   String nim;
   String alamat;
   int semester;
   
   void tampilkanNama (String aku){
       nama = aku;
   }
   void tampilkanNim (String angka1){
      nim  = angka1;
   }
   void tampilkanAlamat (String angka){
       alamat = angka;
   }
   void tampilkanSemester (int berapa){
        semester = berapa;
   }
   
   void infomahasiswa(){
       System.out.println (
       "nama : " + nama + "\n" +
       "nim : " + nim + "\n" +
       "alamat : " + alamat + "\n" +
       "semester : " + semester + "\n" );
   }
    public static void main(String[] args) {
        mahasiswa c = new mahasiswa();
        c.tampilkanNama("dadhwu");
        c.tampilkanNim("L200183070");
        c.tampilkanAlamat("solo");
        c.tampilkanSemester(3);
        c.infomahasiswa();
    }
}

