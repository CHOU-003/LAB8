/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsv;

/**
 *
 * @author DINH CHAU
 */
public class SinhVien {
    private String HoTen;
    private String email;
    private String SĐT;
    private String CMND;
    
    public SinhVien(){
        
    }
    public SinhVien(String HoTen, String email, String SĐT, String CMND){
        this.HoTen = HoTen;
        this.email = email;
        this.SĐT = SĐT;
        this.CMND = CMND;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSĐT() {
        return SĐT;
    }

    public void setSĐT(String SĐT) {
        this.SĐT = SĐT;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    @Override
    public String toString() {
        return "Sinh vien: " + "HoTen=" + HoTen + ", email=" + email + ", S\u0110T=" + SĐT + ", CMND=" + CMND + '}';
    }
    
    
}
