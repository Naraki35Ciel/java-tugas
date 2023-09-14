/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enkapsulasi;

/**
 *
 * @author s
 */

public class main {

   
    public static void main(String[] args) {
   // Membuat objek trapesium
        trapesium objek1 = new trapesium();
        lingkaran bulat = new lingkaran();
        // Mengatur nilai sisi atas, sisi bawah, dan tinggi trapesium dengan setter
        objek1.setAtas(14.0);
        objek1.setBawah(30.0);
        objek1.setTinggi(7.0);
        bulat.setJariJari(7.0);
        // Menghitung luas trapesium
        double luastrapesium = objek1.hitungLuas();
        double luaslingkaran = bulat.hitungLuas();
        double perbedaanLuas = luastrapesium - luaslingkaran;
        // Mencetak hasil
        System.out.println("Luas trapesium dengan sisi atas 14 cm, sisi bawah 30 cm, dan tinggi 7 cm adalah: " + luastrapesium + " cm^2");
        System.out.println("Luas lingkaran dengan jari-jari 7.0 adalah: " + luaslingkaran + " satuan luas");
        System.out.println("Perbedaan luas trapesium dan lingkaran adalah: " + perbedaanLuas + " cm^2");
    }
}
    

