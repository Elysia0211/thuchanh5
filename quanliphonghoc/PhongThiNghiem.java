/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanliphonghoc;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhongThiNghiem extends PhongHoc{
    private String thongTinChuyenNganh;
    private String sucChua;
    private int soBonRua;

    public PhongThiNghiem(String thongTinChuyenNganh, String sucChua, int soBonRua) {
        this.thongTinChuyenNganh = thongTinChuyenNganh;
        this.sucChua = sucChua;
        this.soBonRua = soBonRua;
    }

    public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
    }

    public PhongThiNghiem(String thongTinChuyenNganh, String sucChua, int soBonRua, String maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.thongTinChuyenNganh = thongTinChuyenNganh;
        this.sucChua = sucChua;
        this.soBonRua = soBonRua;
    }

    public String getThongTinChuyenNganh() {
        return thongTinChuyenNganh;
    }

    public void setThongTinChuyenNganh(String thongTinChuyenNganh) {
        this.thongTinChuyenNganh = thongTinChuyenNganh;
    }

    public String getSucChua() {
        return sucChua;
    }

    public void setSucChua(String sucChua) {
        this.sucChua = sucChua;
    }

    public int getSoBonRua() {
        return soBonRua;
    }

    public void setSoBonRua(int soBonRua) {
        this.soBonRua = soBonRua;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc); 
        thongTinChuyenNganh=sc.nextLine();
        sucChua=sc.nextLine();
        soBonRua=sc.nextInt();
    }

    @Override
    public boolean isChuan() {
        return soBonRua > 1;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    @Override
    public void setSoBongDen(int soBongDen) {
        super.setSoBongDen(soBongDen); 
    }

    @Override
    public int getSoBongDen() {
        return super.getSoBongDen(); 
    }
    
    @Override
    public void setDienTich(double dienTich) {
        super.setDienTich(dienTich); 
    }

    @Override
    public double getDienTich() {
        return super.getDienTich(); 
    }

    @Override
    public void setDayNha(String dayNha) {
        super.setDayNha(dayNha); 
    }

    @Override
    public String getDayNha() {
        return super.getDayNha(); 
    }

    @Override
    public void setMaPhong(String maPhong) {
        super.setMaPhong(maPhong); 
    }

    @Override
    public String getMaPhong() {
        return super.getMaPhong(); 
    }

    
    
}
