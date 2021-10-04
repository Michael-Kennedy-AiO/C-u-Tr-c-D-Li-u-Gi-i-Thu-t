package com.tiendd2008110316.tuan1.lab1;

import java.util.Scanner;

public class NhaphesoPTB2 {
	public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);

        System.out.println("Nhập HS 1: ");
        int heso1 = bienNhap.nextInt();
        System.out.println("Nhập HS 2: ");
        int heso2 = bienNhap.nextInt();
        System.out.println("Nhập HS 3: ");
        int heso3 = bienNhap.nextInt();

        double delta = Math.pow(heso2, 2)-4*heso1*heso3;
        System.out.printf("\nDelta: %f",delta);
        System.out.printf("Căn Delta: %f",Math.sqrt(delta));
    }
}
