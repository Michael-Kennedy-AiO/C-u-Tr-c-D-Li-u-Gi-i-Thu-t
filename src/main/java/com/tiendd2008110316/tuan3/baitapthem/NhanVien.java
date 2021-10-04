package com.tiendd2008110316.tuan3.baitapthem;

public class NhanVien {
	String tenNV;
    int luong;
    String diachi;
    String bophanlamviec;
    String ngaysinh;

    void inThongTin(){
        System.out.println("Tên NV: " +tenNV);
        System.out.println("Lương: " +luong);
        System.out.println("Địa Chỉ: " +diachi);
        System.out.println("Bộ Phận Làm Việc: " +bophanlamviec);
        System.out.println("Ngày Sinh: " +ngaysinh);
    }

    NhanVien(){

    }

    NhanVien(String name, String id){
        tenNV = name;
        diachi = id;
    }
}

