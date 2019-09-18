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
public class animalDemo {
    public static void main(String[] args) {
        animal a = new animal();
        animal b = new animal();
        a.beriNama("Harimau");
        a.beriKaki(4);
        a.jenisMakanan("Daging");
        a.typeHewan("Karnivora");
        a.infoHewan();
        
        b.beriNama("Kerbau");
        b.beriKaki(4);
        b.jenisMakanan("Rumput");
        b.typeHewan("Karnivora");
        b.infoHewan();
    }
}
