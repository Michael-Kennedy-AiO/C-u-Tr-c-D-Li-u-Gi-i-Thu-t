package com.tiendd2008110316.tuan1.lab1;

import java.util.Scanner;

public class HotenvaDiem {
	public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);

        System.out.println("Họ và Tên: ");
        String hovaten = bienNhap.nextLine();
        System.out.println("Điểm TP: ");
        double diemtrungbinh = bienNhap.nextDouble();
        
        System.out.printf("HVT "+ hovaten + " ĐTB " + diemtrungbinh);
    }
}
