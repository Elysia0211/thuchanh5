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
public class PhongHocLyThuyet extends PhongHoc{
    private boolean MayChieu;

    public PhongHocLyThuyet() {
    }

    public PhongHocLyThuyet(boolean soMayChieu) {
        this.MayChieu = MayChieu;
    }

    public PhongHocLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
    }

    public PhongHocLyThuyet(boolean soMayChieu, String maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.MayChieu = MayChieu;
    }

    public boolean getSoMayChieu() {
        return MayChieu;
    }

    public void setSoMayChieu(boolean MayChieu) {
        this.MayChieu = MayChieu;
    }

    public void nhap(Scanner sc) {
        super.nhap(sc);
    }

    @Override
    public boolean isChuan() {
        return this.MayChieu && super.isChuan();
    }

    @Override
    public String toString() {
        return null;
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
