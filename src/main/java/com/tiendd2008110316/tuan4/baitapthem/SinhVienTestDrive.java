package com.tiendd2008110316.tuan4.baitapthem;

import java.util.Scanner;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien[] DanhSachSV = new SinhVien[3];

        SinhVien sv0 = new SinhVien("2004110014", "Tai", "19", "Tp. HCM");
        SinhVien sv1 = new SinhVien("2004110015", "Tèo", "20", "Tp. HCM");
        SinhVien sv2 = new SinhVien("2004110016", "Tin", "21", "Tp. HCM");
    
        DanhSachSV[0] = sv0;
        DanhSachSV[1] = sv1;
        DanhSachSV[2] = sv2;

        DanhSachSV[1].inThongTin();
        DanhSachSV[0].inThongTin();
        DanhSachSV[2].inThongTin();
    }
}
