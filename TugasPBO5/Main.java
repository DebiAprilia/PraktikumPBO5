/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO5;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args){
        Kucing lily = new Kucing();
        lily.nama = "Lily";
        lily.jenis = "Anggora";
        lily.suaraKucing = "meeoooowww";
        lily.tampilkanInfoHewan();
        System.out.println();
        
        Anjing hely = new Anjing();
        hely.nama = "Hely";
        hely.jenis = "Buldog";
        hely.suaraAnjing = "GukGukGukGuk";
        hely.tampilkanInfoHewan();
        System.out.println();
        
        Burung bird = new Burung();
        bird.nama = "Bumby";
        bird.jenis = "Lovebird";
        bird.jenisMakanan = "Biji - bijian";
        bird.caraBergerak = "Terbang";
        bird.tampilkanInfoHewan();
        System.out.println();
        
        Monyet monkey = new Monyet();
        monkey.nama = "Rey";
        monkey.jenis = "Gorila";
        monkey.jenisMakanan = "Buah - buahan";
        monkey.caraBergerak = "Berjalan";
        monkey.tampilkanInfoHewan();
    }
}
