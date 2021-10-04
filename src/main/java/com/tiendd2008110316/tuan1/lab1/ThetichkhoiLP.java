package com.tiendd2008110316.tuan1.lab1;

import java.util.Scanner;

public class ThetichkhoiLP {
	public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);

        System.out.println("Nhập vào cạnh: ");
        double canh = bienNhap.nextDouble();
        
        System.out.printf("Thể Tích Khối lP: %f", Math.pow(canh,3));
    }
}
