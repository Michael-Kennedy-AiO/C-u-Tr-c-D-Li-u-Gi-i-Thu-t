package com.tiendd2008110316.tuan3.baitapthem;

import com.tiendd2008110316.tuan3.baitapthem.TaiKhoan;

public class TaiKhoan_TestDrive {
	public static void main(String[] args) {

		TaiKhoan taikhoan;
        taikhoan = new TaiKhoan();
        
        taikhoan.tenchutaikhoan = "Nguyễn Văn C";
        taikhoan.sotaikhoan = "383197673135";
        taikhoan.sodutrongtaikhoan = "100.000.000.000";

        taikhoan.inThongTin();

        taikhoan = new TaiKhoan("Nguyễn Văn A", "302679283", "100.000.000");
        System.out.println("\nTên Chủ Tài Khoản: "+taikhoan.tenchutaikhoan+"\nSố Tài khoản: "+taikhoan.sotaikhoan+"\nSố dư tài khoản: "+taikhoan.sodutrongtaikhoan);
    }
}

