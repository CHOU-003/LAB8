/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsv;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DINH CHAU
 */
public class DSSV {
    public ArrayList<SinhVien> danhsach = new ArrayList<>();
    
    Scanner sc = new Scanner(System.in);
    public void Nhap(){
        while (true) {            
        System.out.println("Nhap ho va ten sinh vien: "); String HoTen = sc.next();
        System.out.println("Nhap email: "); String email = sc.next();
        while(!KTEmail(email)){
            System.out.println("Nhap sai email !!!");
            email = sc.next();
        }
        System.out.println("Nhap SĐT: "); String SĐT = sc.next();
        while(!KTSDT(SĐT)){
            System.out.println("Nhap sai sđt !!!");
            SĐT = sc.next();
        }
        System.out.println("Nhap cmnd: "); String CMND = sc.next();sc.nextLine();
           while(!KTCMND(CMND)){
            System.out.println("Nhap sai CMNF !!!");
            CMND = sc.next();sc.nextLine();
        }
        SinhVien sv = new SinhVien(HoTen, email, SĐT, CMND);
        danhsach.add(sv);
        
            System.out.println("Nhap tiep:(Yes/No) ");
            if(sc.nextLine().equals("No")){
                break;
            }
        }
    }
    public boolean KTEmail(String email) {
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                        "[a-zA-Z0-9_+&*-]+)*@" + 
                        "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                        "A-Z]{2,7}$"; 
                              
    Pattern pat = Pattern.compile(emailRegex); 
    if (email == null) 
        return false; 
    return pat.matcher(email).matches(); 
    } 
    
    public boolean  KTSDT(String phone){
        Pattern pt = Pattern.compile("\\d{10}");
        Matcher mc = pt.matcher(phone);
        return  mc.matches();
    }
    
    public boolean KTCMND(String cm){
        Pattern pt = Pattern.compile("\\d{9,12}");
        Matcher mc = pt.matcher(cm);
        return mc.matches();
    }
    public void Xuat(){
        for(SinhVien sv : danhsach){
            System.out.println(sv.toString());
        }
    }
    
}
