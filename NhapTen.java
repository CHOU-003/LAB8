/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaychuoi;

/**
 *
 * @author DINH CHAU
 */
public class NhapTen {
    private String Ho;
    private String TenDem;
    private  String Ten;

    public NhapTen() {
    }

    public NhapTen(String Ho, String TenDem, String Ten) {
        this.Ho = Ho;
        this.TenDem = TenDem;
        this.Ten = Ten;
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public String getTenDem() {
        return TenDem;
    }

    public void setTenDem(String TenDem) {
        this.TenDem = TenDem;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    @Override
    public String toString() {
        return "NhapTen{" + "Ho=" + Ho + ", TenDem=" + TenDem + ", Ten=" + Ten + '}';
    }
    
    
}
