/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author SAP
 */
public class CobaKendaraan {
    public static void main (String args[]){
        Kendaraan kendaraan1 = new Kendaraan();
        Mobil mobil1 = new Mobil();
        Pesawat pesawat1 = new Pesawat();
        System.out.println("--");
        mobil1.bergerak();
        mobil1.mengerem();
        mobil1.berjalanMundur();
        System.out.println("--");
        pesawat1.mengerem();
        pesawat1.terbang();
    }
}
