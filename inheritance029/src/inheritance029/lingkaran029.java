/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance029;

/**
 *
 * @author Asus
 */
public class lingkaran029 extends bangundatar029{
     float r;
    
    @Override
    float luas() {
        float luas = (float) (Math.PI*r*r);
        System.out.println("Luas Lingkaran = " + luas);
        return luas;
    }
    
}
