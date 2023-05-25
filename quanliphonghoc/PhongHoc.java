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
public class PhongHoc {
    private String maPhong;
    private String dayNha;
    private double dienTich;
    private int soBongDen;

    public PhongHoc() {
    }

    public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getDayNha() {
        return dayNha;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }

    @Override
    public String toString() {
        return String.format("%20s %10s %20s %20s",maPhong, dayNha, dienTich, soBongDen);
    }
    public boolean isChuan(){
        return (this.dienTich/this.soBongDen) >= 10;
    }
    public void nhap(Scanner sc){
        System.out.println("Nhap vao ma phong");
        maPhong = sc.nextLine();
        System.out.println("Nhap vao dien tich");
        dienTich = sc.nextDouble();
        System.out.println("Nhap vao so bong den");
        soBongDen = sc.nextInt();
    }
    public void xuat(){
        System.out.println(" ma phong" + maPhong);
        System.out.println(" dien tich" + dienTich);
        System.out.println(" so bong den" + soBongDen);
    }
}
