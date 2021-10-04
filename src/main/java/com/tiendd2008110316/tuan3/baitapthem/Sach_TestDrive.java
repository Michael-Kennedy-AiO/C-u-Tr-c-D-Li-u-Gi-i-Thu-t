package com.tiendd2008110316.tuan3.baitapthem;

import com.tiendd2008110316.tuan3.baitapthem.Sach;

public class Sach_TestDrive {
	public static void main(String[] args) {

        Sach sach;
        sach = new Sach();
        
        sach.gia = 18000;
        sach.nhaxuatban ="Kim Đồng";
        sach.giaban = 20000;
        sach.soluong = 500;

        sach.inThongtin();

        sach = new Sach(19000, 500, "Detective");
        System.out.println("\nGiá bán: "+sach.gia+("\nSố lượng in: "+sach.soluong+"\nLoại sách: "+sach.loai));

    }
}
