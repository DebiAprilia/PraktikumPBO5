/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO5;

/**
 *
 * @author user
 */
public class BerkakiDua extends Hewan {
    String jenisMakanan;
    String caraBergerak;
    
    @Override
    public void tampilkanInfoHewan(){
        super.tampilkanInfoHewan();
        System.out.println("Jenis Makanan : "+ jenisMakanan);
        System.out.println("Cara bergerak : "+ caraBergerak);
    }
}
