package com.tiendd2008110316.tuan2.lab2;

import java.util.Scanner;

public class TinhTienDien {
	public static void main(String[] args) {

        Scanner bienNhap = new Scanner(System.in);
        System.out.println("Nhập số điện sử dụng: ");
        double sodiensudung = bienNhap.nextDouble();

        if(sodiensudung < 50){
            System.out.printf("Tiền điện: %.2f", sodiensudung*1000);
        }else{
            System.out.printf("Tiền điện: %.2f", sodiensudung*1200);
        }
    }
}
