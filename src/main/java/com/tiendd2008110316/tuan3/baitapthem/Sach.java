package com.tiendd2008110316.tuan3.baitapthem;

import java.util.zip.DataFormatException;

public class Sach {
	int gia;
    String nhaxuatban;
    DataFormatException Namxuatban;
    int giaban;
    int soluong;
    String loai;

    void inThongtin(){
        System.out.println("Giá xuất bản: " +gia);
        System.out.println("Nhà xuất bản: " +nhaxuatban);
        System.out.println("Năm xuất bản: " +Namxuatban);
        System.out.println("Giá bán: " +giaban);
        System.out.println("Số lượng xuất bản: " +soluong);
        System.out.println("Loại sách: " +loai);
    }

    Sach(){

    }

    Sach(int cost, int howmany, String wkind){
       gia = cost;
       soluong = howmany;
       loai = wkind;
    }
}
