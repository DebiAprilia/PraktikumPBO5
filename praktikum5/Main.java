/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args){
        Mobil mobil = new Mobil();
        mobil.nama = "Brio";
        mobil.kecepatan = 150;
        mobil.jumlahPintu = 4;
        mobil.tampilkanInfo();
        
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Vario 160";
        motor.kecepatan = 128;
        motor.jenisMesin = "SOHC";
        motor.tampilkanInfo();
    }
}
