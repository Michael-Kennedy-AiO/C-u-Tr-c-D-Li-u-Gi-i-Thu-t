package com.tiendd2008110316.tuan3.baitapthem;

public class TaiKhoan {
	String tenchutaikhoan;
    String sotaikhoan;
    String sodutrongtaikhoan;

    void inThongTin(){
        System.out.println("Tên Chủ Tài Khoản: "+tenchutaikhoan);
        System.out.println("Số Tài khoản: "+sotaikhoan);
        System.out.println("Số Dư Trong Tài Khoản: "+sodutrongtaikhoan);
    }

    TaiKhoan(){

    }
    TaiKhoan(String name, String id, String balance){
        tenchutaikhoan = name;
        sotaikhoan = id;
        sodutrongtaikhoan = balance;
    }
}
