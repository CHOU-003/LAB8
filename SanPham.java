/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testthusp;

/**
 *
 * @author DINH CHAU
 */
public class SanPham {
    private String TenSP;
    private double donGia;
    private String hang;
    
    public SanPham(){
        
    }
    public SanPham(String TenSP, double donGia, String hang){
        this.TenSP = TenSP;
        this.donGia = donGia;
        this.hang  = hang;
        
    }
    
    public String getTenSP(){
        return TenSP;
    }
    public void setTenSP(String TenSP){
        this.TenSP = TenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    @Override
    public String toString() {
        return "SanPham: " + "TenSP=" + TenSP + ", donGia=" + donGia + ", hang=" + hang + '.';
    }
    
   
}
