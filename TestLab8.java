/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testlab8;

/**
 *
 * @author DINH CHAU
 */
public class TestLab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SanPham sp1 = new SanPham("San Pham 1", 12000);
       sp1.XUat();
       sp1.tinhThueNhapKhau();
       
       SanPham sp2 = new SanPham("San Pham 2", 25000, 0.2);
       sp2.XUat();
       sp2.tinhThueNhapKhau();
       
        
    }
    
}
