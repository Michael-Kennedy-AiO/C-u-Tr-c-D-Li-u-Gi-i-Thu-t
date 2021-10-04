package com.tiendd2008110316.tuan3.baitapthem;

import com.tiendd2008110316.tuan3.baitapthem.ConBo;

public class ConBo_TestDrive {
	public static void main(String[] args) {
        ConBo cow;
        cow = new ConBo(15, "Tây Ban Nha", "Đen");
        System.out.println("\nCân nặng: " + cow.weight +" \nGiống: " + cow.breed +" \nMàu: " + cow.color);
    }
}
