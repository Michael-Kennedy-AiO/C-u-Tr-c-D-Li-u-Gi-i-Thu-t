package com.tiendd2008110316.tuan3.baitapthem;

import com.tiendd2008110316.tuan3.baitapthem.MayTinh;

public class MayTinh_TestDrive {
	public static void main(String[] args) {

        MayTinh maytinh;
        maytinh = new MayTinh();
        
        maytinh.nhasanxuat = "Microsorft";
        maytinh.namsanxuat = "2021";
        maytinh.hedieuhanh = "Window 7";
        maytinh.ram = "16GB";
        maytinh.cpu = "Intel core i7 9800HQ";
        maytinh.gia = 55000000;
        maytinh.nambaohanh = "1 năm";

        maytinh.inThongTin();

        maytinh = new MayTinh("IBM", "1969", "window 11", "2 năm");
        System.out.println("\nNhà xản xuất: " + maytinh.nhasanxuat +" \nNăm sản xuất: "+maytinh.namsanxuat+" \nHệ Điều Hành: " +maytinh.hedieuhanh+"\nNăm bảo hành: "+maytinh.nambaohanh);

    }
}
