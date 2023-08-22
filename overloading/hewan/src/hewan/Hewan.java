/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hewan;

/**
 *
 * @author Asus
 */
public class Hewan {
    public void makan() {
        System.out.println("Hewan makan");
    }
    public void makan(String makanan) {
        System.out.println("Hewan makan " + makanan);
    }
    public void makan(String makanan, int jumlah) {
        System.out.println("Hewan makan " + makanan + " sebanyak " + jumlah);
    }

    
    public static void main(String[] args) {
         Hewan hewan = new Hewan();
        hewan.makan();
        hewan.makan("Buah");
        hewan.makan("Buah", 5);
    }
    
}
