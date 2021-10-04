package com.tiendd2008110316.tuan3.baitapthem;

import com.tiendd2008110316.tuan3.baitapthem.NhanVien;

public class NhanVienTestDrive {
public static void main(String[] args) {
        
	NhanVien nhanvien;
        nhanvien = new NhanVien();

        nhanvien.tenNV = "Nguyễn Văn A";
        nhanvien.luong = 10000000;
        nhanvien.diachi = "123/5/6 Lý Thường Kiệt, Quận 10, Tp HCM";
        nhanvien.bophanlamviec = "IT";
        nhanvien.ngaysinh = "21/12/2112";

        nhanvien.inThongTin();

        nhanvien = new NhanVien("Lâm Vũ Thành Tài", "1245/678,Lý Thường Kiệt, Quận 10, Tp HCm");
        System.out.println("\nHọ và tên SV: "+nhanvien.tenNV+"\nĐịa chỉ: "+nhanvien.diachi);
    }
}
