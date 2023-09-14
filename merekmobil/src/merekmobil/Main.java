/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package merekmobil;

/**
 *
 * @author s
 */
public class Main {

 
public class MainClass {
    public static void main(String[] args) {
       
        MerekMobil0 mobil = new MerekMobil0("Toyota", 2023);

        
        System.out.println("Nama Merek: " + mobil.getNamaMerek());
        System.out.println("Tahun Produksi: " + mobil.getTahunProduksi());

    
        mobil.setNamaMerek("Honda");
        mobil.setTahunProduksi(2022);

       
        System.out.println("Nama Merek (setelah perubahan): " + mobil.getNamaMerek());
        System.out.println("Tahun Produksi (setelah perubahan): " + mobil.getTahunProduksi());
    }
}

    
}
