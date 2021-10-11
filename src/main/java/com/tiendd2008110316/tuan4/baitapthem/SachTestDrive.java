package com.tiendd2008110316.tuan4.baitapthem;

public class SachTestDrive {
    public static void main(String[] args) {
        
        Sach[] DSsach = new Sach[2];
        
        Sach sach0 = new Sach("18.000đ", "Kim Đồng", "2004", "Trinh Thám");
        Sach sach1 = new Sach("19.000đ", "Kim Đồng", "2008", "Hài Hước");
        
        DSsach[0] = sach0;
        DSsach[1] = sach1;

        DSsach[0].intThongTin();
        DSsach[1].intThongTin();
        
    }
}
