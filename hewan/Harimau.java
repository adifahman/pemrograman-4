/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

/**
 *
 * @author SAP
 */
public class Harimau extends Hewan{
    public Harimau(){
        super();
        System.out.println("Harimau beranak");
    }
    
    @Override
    public void makan(){
        System.out.println("Harimau bermain");
    }
    
    @Override
    public void tidur(){
        System.out.println("Harimau tidur");
    }
}
