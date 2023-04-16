/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testthusp;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
/**
 *
 * @author DINH CHAU
 */
public class DanhSachSANPHAM {
    public ArrayList<SanPham> danhsach = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void Nhap(){
        while (true) {            
            System.out.println("Nhap ten san pham: "); String TenSP = sc.next();
            System.out.println("Nhap don gia san pham: "); double donGia = sc.nextDouble();
            System.out.println("Nhap hang san pham: "); String hang = sc.next();sc.nextLine();
            SanPham sp = new SanPham(TenSP, donGia, hang);
            danhsach.add(sp);
            
            System.out.println("Nhap them san pham:(Yes/No) ");
            if(sc.nextLine().equals("No")){
                break;
            }
        }
    }
    
    public void Xuat(){
        for(SanPham sp : danhsach){
            System.out.println("San pham vua nhap la: " + sp.toString());
        }
    }
    
    public void XuatNoKiA(){
        for(SanPham sp: danhsach){
            if(sp.getHang().equals("Nokia")){
                System.out.println("Danh sach hang Nokia: " + sp.toString());
            }
        }
    }
}
