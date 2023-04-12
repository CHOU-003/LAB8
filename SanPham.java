/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testlab8;

import java.util.Scanner;
/**
 *
 * @author DINH CHAU
 */
public class SanPham {
    private String TenSp;
    private double donGia;
    private double giamGia;
    
    public SanPham(){
        
    }

    public SanPham(String TenSp, double donGia, double giamGia) {
        this.TenSp = TenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String TenSp, double donGia){
        this.TenSp = TenSp;
        this.donGia = donGia;
        this.giamGia = 0;
    }
    public String getTenSp() {
        return TenSp;
    }

    public void setTenSp(String TenSp) {
        this.TenSp = TenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
    private double getThueNhapKhau(){
        double Thue = this.getDonGia() * 0.1;
        System.out.println("Thue nhap khau la: " + Thue);
        return Thue;
    }

    public double tinhThueNhapKhau(){
        return getThueNhapKhau();
    }
    @Override
    public String toString() {
        return "SanPham{" + "TenSp=" + TenSp + ", donGia=" + donGia + ", giamGia=" + giamGia + '}';
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: "); this.TenSp = sc.next();sc.nextLine();
        System.out.print("Nhap don gia cua san pham: "); this.donGia = sc.nextDouble();
        System.out.print("Nhap gia giam cua san pham: "); this.giamGia = sc.nextDouble();
    }
    
    public void XUat(){
        System.out.println(toString());
    }
}
