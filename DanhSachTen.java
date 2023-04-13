/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaychuoi;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Scanner;
import java.lang.String;
/**
 *
 * @author DINH CHAU
 */
public class DanhSachTen {
    public ArrayList<NhapTen> danhsach = new ArrayList<>();
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.print("Nhap Ho: "); String Ho = sc.next();
        System.out.print("Nhap Ten Dem: "); String TenDem = sc.next();
        System.out.print("Nhap Ten: "); String Ten = sc.next();
        NhapTen nt = new NhapTen(Ho, TenDem, Ten);
        danhsach.add(nt);
        
        System.out.println("Nhap them ten(Co hoac Ko): ");
        sc.nextLine();
        if(sc.nextLine().equals("Ko")){;
            break;
    }}
   }
    
    public void Xuat(){
        for(NhapTen t : danhsach){
            System.out.println("Danh sach ten ban vua nhap: " + t.toString());
        }
    }
    
    public void toUpperCase(String str){
        for(NhapTen tq : danhsach){
            String Ho = tq.getHo().toUpperCase();
            String TenDem = tq.getTenDem().substring(1);
            String Ten = tq.getTen().toUpperCase();
            int hoIndex = Ho.indexOf(str);
            int tenIndex = Ten.lastIndexOf(str);

        if (hoIndex >= 0) {
            Ho = Ho.substring(2, hoIndex) + str + Ho.substring(hoIndex + str.length());
            }
        if (tenIndex >= 0) {
            Ten = Ten.substring(1, tenIndex) + str + Ten.substring(tenIndex + str.length());
        }
            tq.setHo(Ho);
            tq.setTenDem(TenDem);
            tq.setTen(Ten); 
         
        }
        
    }
    
}
