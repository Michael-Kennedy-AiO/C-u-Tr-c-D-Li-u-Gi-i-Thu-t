package com.tiendd2008110316.tuan3.baitapthem;
import java.util.zip.DataFormatException;

public class MayTinh {
	String nhasanxuat;
    String namsanxuat;
    String hedieuhanh;
    String ram;
    String cpu;
    int gia;
    String nambaohanh;

    void inThongTin(){
        System.out.println("Nhà Sản Xuất: "+nhasanxuat);
        System.out.println("Năm Sản Xuát: "+namsanxuat);
        System.out.println("Hệ Điều Hành: "+hedieuhanh);
        System.out.println("RAM: "+ram);
        System.out.println("CPU: "+cpu);
        System.out.println("Giá: "+gia);
        System.out.println("Năm Bảo Hành: "+nambaohanh);
    }

    MayTinh(){
        
    }

    MayTinh(String nsx, String ysx, String hdh, String nbh){
        nhasanxuat = nsx;
        namsanxuat = ysx;
        hedieuhanh = hdh;
        nambaohanh = nbh;
    }
}
