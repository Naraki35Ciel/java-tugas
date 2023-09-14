/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enkapsulasi;

/**
 *
 * @author s
 */
public class trapesium {
     private double atas;    // Panjang sisi atas trapesium
    private double bawah;   // Panjang sisi bawah trapesium
    private double tinggi;  // Tinggi trapesium

    // Konstruktor untuk menginisialisasi sisi atas, sisi bawah, dan tinggi trapesium
    public trapesium() {
        // Default constructor
    }

    // Getter untuk sisi atas (atas)
    public double getAtas() {
        return atas;
    }

    // Setter untuk sisi atas (atas)
    public void setAtas(double atas) {
        this.atas = atas;
    }
     // Getter untuk sisi bawah (bawah)
    public double getBawah() {
        return bawah;
    }

    // Setter untuk sisi bawah (bawah)
    public void setBawah(double bawah) {
        this.bawah = bawah;
    }

    // Getter untuk tinggi (tinggi)
    public double getTinggi() {
        return tinggi;
    }
    
 // Setter untuk tinggi (tinggi)
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // Metode untuk menghitung luas trapesium
    public double hitungLuas() {
        // Menggunakan rumus luas trapesium: ((sisi atas + sisi bawah) * tinggi) / 2
        double luas = ((atas + bawah) * tinggi) / 2;
        return luas;
    }
    
}
