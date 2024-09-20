/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO5;

/**
 *
 * @author user
 */
public class Kucing extends Hewan {
    String suaraKucing;
    
    @Override
    public void tampilkanInfoHewan(){
        super.tampilkanInfoHewan();
        System.out.println("Suara : "+ suaraKucing);
    }
}
