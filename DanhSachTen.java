/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DINH CHAU
 */
public class DanhSachTen{
    public ArrayList<String> menu = new  ArrayList<>();

    @Override
    public String toString() {
        return "DanhSachTen{" + "menu=" + menu + '}';
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
          while(true){
              String Ho = sc.next();
              menu.add(Ho);
              String Ten = sc.next();
              menu.add(Ten);
              
              System.out.println("Nhap tiep Ho va Ten:(Yes or No) ");
              if(sc.nextLine().equals("No")){
                break;
            }
          }
    }
    
    public void Xuat(){
        for(String s : menu){
            System.out.println("Ho ten vua nhap la: " + s.toString());
        }
    }
    
      public void hoandoiNgauNhien(){
        Collections.shuffle(menu);
        System.out.println("Danh sach ngau nhien: " + menu);
    }
    
    public void sapxepGiamdan(){
        Collections.sort(menu);
        Collections.reverse(menu);
        System.out.println("Da sap xep giam dan: " + menu);
    }
    
    public void xoaPhanTu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri can xoa: ");
        String Ten = sc.next();sc.nextLine();
        for (String s : menu) {
            if (s == Ten) {
                menu.remove(s);
                System.out.println("Da xoa " + Ten + " khoi danh sach.");
                break;
            }
        }
    }
}
