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
public class PhongMayTinh extends PhongHoc{
    private int soMayTinh;

    public PhongMayTinh() {
    }

    public PhongMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
    }

    public PhongMayTinh(int soMayTinh, String maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayTinh = soMayTinh;
    }

    public int getSoMayTinh() {
        return soMayTinh;
    }

    public void setSoMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.println("Nhap vao so may tinh");
        soMayTinh=sc.nextInt();
    }

    @Override
    public boolean isChuan() {
        return (this.getDienTich()/this.soMayTinh) <= 1.5;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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
