package com.tiendd2008110316.tuan4.baitapthem;
import java.util.zip.DataFormatException;
public class SinhVien {
    String mssv;
    String name;
    String tuoi;
    String quequan;

    SinhVien(String m, String n, String t, String q){
        mssv = m;
        name = n;
        tuoi = t;
        quequan = q;
    }

    void inThongTin(){
        System.out.println("-------Thông Tin---------");
        System.out.println("Mã số Sinh viên: " +mssv);
        System.out.println("Tên Sinh viên: "+name);
        System.out.println("Tuổi Sinh vien: "+tuoi);
        System.out.println("Quê Quán: "+quequan);
    }
}  
