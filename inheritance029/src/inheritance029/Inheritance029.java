/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance029;

/**
 *
 * @author Asus
 */
public class Inheritance029 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         bangundatar029 BangunDatar = new bangundatar029();
       
        // membuat objek persegi dan mengisi nilai properti
        persegi029 persegi = new persegi029();
        persegi.sisi = 2;
       
        // membuat objek Lingkaran dan mengisi nilai properti
        lingkaran029 lingkaran = new lingkaran029();
        lingkaran.r = 22;
       
        // membuat objek Persegi Panjang dan mengisi nilai properti
        persegipanjang029 persegiPanjang = new persegipanjang029();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
       
        // membuat objek Segitiga dan mengisi nilai properti
        segitiga029 Segitigas = new segitiga029();
        Segitigas.alas = 65;
        Segitigas.tinggi = 5;
       
       
        // memanggil method luas dan keliling
        BangunDatar.luas();
        BangunDatar.keliling();
       
        persegi.luas();
        persegi.keliling();
       
        lingkaran.luas();
        lingkaran.keliling();
       
        persegiPanjang.luas();
        persegiPanjang.keliling();
       
        Segitigas.luas();
    }
    
}
