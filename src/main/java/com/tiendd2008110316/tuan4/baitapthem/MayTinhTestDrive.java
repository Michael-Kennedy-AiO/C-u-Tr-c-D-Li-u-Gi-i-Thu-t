package com.tiendd2008110316.tuan4.baitapthem;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        
        MayTinh[] DSmaytinh = new MayTinh[2];

        MayTinh mt1 = new MayTinh("Microsorft", "64GB", "Intel core i9", "GTX 3050");
        MayTinh mt2 = new MayTinh("Microsorft", "8GB", "Intel core i5", "HD Graphics 620");
        
        DSmaytinh[0] = mt1;
        DSmaytinh[1] = mt2;

        DSmaytinh[0].inThongTin();
        DSmaytinh[1].inThongTin();
    }
}
