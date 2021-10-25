package com.tiendd2008110316.tuan8.kiemtragiuaky;

import java.util.Scanner;

public class MainAppSotre {
	public static AppleStore listApple = new AppleStore();
	public static Scanner bienNhap = new Scanner(System.in);
	public static void main(String[] args) {
        while (true){
    		System.out.println("------------------MENU----------");
            System.out.println("1)  Thêm táo                 |");
            System.out.println("2)  Tìm táo theo màu        	|");
            System.out.println("3)  In danh sách táo         |");
            System.out.println("4)  Thoát            	|");
            System.out.println("--------------------------------");
            System.out.print("Chọn chức năng: ");
            int key = bienNhap.nextInt();
        	
        	switch(key){
        	case 1:	ThemTao();break;
        	case 2: TimTaoTheoMau();break;
        	case 3: inDStao();break;
        	default: break;
        	}
        }
	}
	
	public static void ThemTao() {
		listApple.addApple();
	}
	
	public static void TimTaoTheoMau() {
		System.out.println("Nhập màu táo muốn tìm: ");
		bienNhap.nextLine();
		String color = bienNhap.nextLine();
		System.out.println("Các trái táo màu Đỏ:");
		listApple.FindAppleWithColor(color);
	}
	
	public static void inDStao() {
		listApple.inListApple();
	}
	
}
