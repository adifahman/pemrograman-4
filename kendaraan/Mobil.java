/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author SAP
 */
public class Mobil extends Kendaraan{
    public Mobil(){
        super();
        System.out.println("Mobil di produksi");
    }
    
    public void berjalanMundur(){
        System.out.println("Mobil berjalan mundur");
    }
}