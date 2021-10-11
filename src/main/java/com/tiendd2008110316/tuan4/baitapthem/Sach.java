package com.tiendd2008110316.tuan4.baitapthem;

public class Sach {
    String gia;
    String nhaxuatban;
    String namxuatban;
    String loai;

    public Sach(){
    }

    public Sach(String c, String n, String y, String k){
        gia = c;
        nhaxuatban = n;
        namxuatban = y;
        loai = k;
    }

    void intThongTin(){
        System.out.println("------Thông Tin-------");
        System.out.println("Giá của sách: "+gia);
        System.out.println("Nhà xuất bản: "+nhaxuatban);
        System.out.println("Năm Xuất Bản: "+namxuatban);
        System.out.println("Loại sách: "+loai);
    }
}
