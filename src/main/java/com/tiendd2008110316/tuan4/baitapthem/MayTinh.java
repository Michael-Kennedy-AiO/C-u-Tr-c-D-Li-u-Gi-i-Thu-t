package com.tiendd2008110316.tuan4.baitapthem;

public class MayTinh {
    
    String hang;
    String ram;
    String cpu;
    String vga;

    public MayTinh(){
    }

    public MayTinh(String h, String r, String c, String v){
        hang = h;
        ram = r;
        cpu = c;
        vga = v;
    }

    void inThongTin(){
        System.out.println("--------Thông Tin---------");
        System.out.println("Hãng sản xuất: "+hang);
        System.out.println("CPU: "+cpu);
        System.out.println("Ram: "+ram);
    }
}
