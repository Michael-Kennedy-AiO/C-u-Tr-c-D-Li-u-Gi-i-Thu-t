package com.tiendd2008110316.tuan4.baitapthem;

public class XeTestDrive {
    public static void main(String[] args) {
        
        Xe[] DSxe = new Xe[2];

        Xe xe1 = new Xe("Nguyễn Văn A", "Honda", "Xe số", "Có");
        Xe xe2 = new Xe("Nguyễn Văn B", "Yamaha", "Xe tay ga", "Không");

        DSxe[0] = xe1;
        DSxe[1] = xe2;

        DSxe[0].inThongTin();
        DSxe[1].inThongTin();
    }
}
