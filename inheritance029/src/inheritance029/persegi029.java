/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance029;

/**
 *
 * @author Asus
 */
public class persegi029 extends bangundatar029{
    float sisi;
    @Override
    float luas(){
        float luas = sisi*sisi;
        System.out.println("Luas Persegi = " + luas);
        return luas;
    }
    @Override
    float keliling(){
        float keliling = 4*sisi;
        System.out.println("Keliling Persegi = "  + keliling);
        return keliling;
    }
    
}
