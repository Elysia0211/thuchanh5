/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanliphonghoc;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLiPhongHoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DanhSachPhongHoc ql = new DanhSachPhongHoc();

        PhongHocLyThuyet lyThuyet1 = new PhongHocLyThuyet("LT1","A",100,10);
        PhongMayTinh mayTinh1 = new PhongMayTinh("MT1","B",80,8);
        PhongThiNghiem thiNghiem1 = new PhongThiNghiem("TN1","C",150,15);
        PhongHocLyThuyet lyThuyet2 = new PhongHocLyThuyet("LT2", "D",120,12);
        PhongMayTinh mayTinh2 = new PhongMayTinh("MT2","E",90,9);
        PhongThiNghiem thiNghiem2 = new PhongThiNghiem("TN2","F",200,20);
        
        ql.themPH(lyThuyet1);
        ql.themPH(lyThuyet2);
        ql.themPH(mayTinh1);
        ql.themPH(mayTinh2);
        ql.themPH(thiNghiem1);
        ql.themPH(thiNghiem2);
        
        System.out.println("Danh sach phong hoc: ");
        ql.inDanhSachPhongHoc();
        
        System.out.println("Danh sach phong hhoc dat chuan : ");
        ql.inDanhSachPhongHocDatChuan();
        
        ql.sapXepTheoSoBongDenTangDan();
        System.out.println("Danh sach phong hoc sau khi sap xep so bong den : ");
        ql.inDanhSachPhongHoc();
        
        ql.sapXepTheoDayNha();
        System.out.println("Danh sach phong hoc sau khi sap xep theo day nha : ");
       ql.inDanhSachPhongHoc();
        
       
        
        
        System.out.println("Danh sach phong hoc 60 may tinh : ");
        ql.inDanhSachPhongMay60May();
    }
    
       
}
