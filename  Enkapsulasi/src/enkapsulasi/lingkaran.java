/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enkapsulasi;

/**
 *
 * @author s
 */
public class lingkaran {
    private double jariJari;  // Panjang jari-jari lingkaran

    // Konstruktor untuk menginisialisasi jari-jari lingkaran
    public lingkaran() {
        // Default constructor
    }

    // Getter untuk jari-jari (jariJari)
    public double getJariJari() {
        return jariJari;
    }

    // Setter untuk jari-jari (jariJari)
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    // Metode untuk menghitung luas lingkaran
    public double hitungLuas(){
        // Menggunakan rumus luas lingkaran: Pi * jari-jari^2
    double luas = Math.PI * Math.pow(jariJari, 2);
    return luas;
    }
    
}
