/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuso;


import java.util.Scanner;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
/**
 *
 * @author DINH CHAU
 */
public class DanhSachSoThuc {
    public ArrayList<Double> list = new ArrayList<>();
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        while(true){
            Double x = sc.nextDouble();
            list.add(x);
            
            System.out.print("Nhap them tiep ?");
            sc.nextLine();
            if(sc.nextLine().equals("No")){
                break;
            }
        }
       }

    public double tinhTong(){
        double Tong =0 ;
        for(Double x : list){
            Tong = Tong + x;
        }
        System.out.println("Tong la: " + Tong);
        return  Tong;
    }
    @Override
    public String toString() {
        return "DanhSachSoThuc{" + "list=" + list + '}';
    }
    
    public void Xuat(){
        for(Double de : list){
            System.out.println("Cac so vua nhap la: " + de.toString());
        }
    }
}
