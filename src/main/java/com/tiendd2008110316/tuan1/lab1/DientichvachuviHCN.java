package com.tiendd2008110316.tuan1.lab1;

import java.util.Scanner;

public class DientichvachuviHCN {
	 public static void main(String[] args) {
	        Scanner nhap = new Scanner(System.in);

	        System.out.println("Nhập chiều dài: ");
	        double chieudai = nhap.nextDouble();
	        System.out.println("Nhập chiều rộng: ");
	        double chieurong = nhap.nextDouble();
	        
	        System.out.printf("Chu vi HCN: %f", ((chieudai + chieurong)*2));
	        System.out.printf("\nDien tich HCN: %f", chieudai * chieurong);
	        System.out.printf("\nCạnh nho HCN: %f", Math.min(chieudai,chieurong));
	    }
}
