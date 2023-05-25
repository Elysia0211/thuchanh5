/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanliphonghoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DanhSachPhongHoc {
    private List<PhongHoc> ds = new ArrayList<PhongHoc>();
    
    
    private PhongHoc timkiem(String maPhong){
        for(PhongHoc ph : ds){
            if(ph.getMaPhong().equals(maPhong)){
                return ph;
            }
        }
        return null;
    }
    
    public boolean themPH(PhongHoc ph){
        for(PhongHoc pha: ds){
            if(ph.getMaPhong().equals(ph.getMaPhong())){
                return false;
            }
        }
        ds.add(ph);
        return true;
    }
    
   

    public void inDanhSachPhongHoc() {
        for (PhongHoc phongHoc : ds) {
            System.out.println(phongHoc);
        }
    }

    public void inDanhSachPhongHocDatChuan() {
        for (PhongHoc phongHoc : ds) {
            if (phongHoc instanceof PhongHocLyThuyet) {
                if (((PhongHocLyThuyet) phongHoc).getSoMayChieu()) {
                    System.out.println(phongHoc);
                }
            } else if (phongHoc instanceof PhongMayTinh) {
                if (phongHoc.getDienTich() / ((PhongMayTinh) phongHoc).getSoMayTinh() >= 1.5) {
                    System.out.println(phongHoc);
                }
//            } else if (phongHoc instanceof PhongThiNghiem) {
//                if (((PhongThiNghiem) phongHoc).getSoBonRua()) {
//                    System.out.println(phongHoc);
//                }
            }
        }
    }

    public void sapXepTheoDayNha() {
        Collections.sort(ds, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc phongHoc1, PhongHoc phongHoc2) {
                return phongHoc1.getDayNha().compareTo(phongHoc2.getDayNha());
            }
        });
    }

    public void sapXepTheoDienTichGiamDan() {
        Collections.sort(ds, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc phongHoc1, PhongHoc phongHoc2) {
                return Double.compare(phongHoc2.getDienTich(), phongHoc1.getDienTich());
            }
        });
    }

    public void sapXepTheoSoBongDenTangDan() {
        Collections.sort(ds, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc phongHoc1, PhongHoc phongHoc2) {
                return Integer.compare(phongHoc1.getSoBongDen(), phongHoc2.getSoBongDen());
            }
        });
    }

    public void xoaPhongHoc(String maPhong) {
        for (PhongHoc phongHoc : ds) {
            if (phongHoc.getMaPhong().equals(maPhong)) {
                ds.remove(phongHoc);
                System.out.println("Đã xóa phòng " + maPhong);
                return;
            }
        }
    }

    public void inDanhSachPhongMay60May() {
        System.out.println("Tổng số phòng học: " + ds.size());
    }

    public void inTongSoPhongHoc() {
        for (PhongHoc phongHoc : ds) {
            if (phongHoc instanceof PhongMayTinh && ((PhongMayTinh) phongHoc).getSoMayTinh() == 60) {
                System.out.println(phongHoc);
            
    }
}
    }

    public void capNhatSoMayTinh(String maPhong, int soMayTinhMoi) {
    }

   
}

