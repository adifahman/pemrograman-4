/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

/**
 *
 * @author SAP
 */
public class Try {
    public static void main (String args[]){
        Hewan hewan1 = new Hewan();
        Kucing kucing1 = new Kucing();
        Harimau harimau1 = new Harimau();
        
        hewan1.makan();
        hewan1.tidur();
        
        kucing1.bermain();
        kucing1.makan();
        kucing1.tidur();
        
        harimau1.makan();
        harimau1.tidur();
    }
}
