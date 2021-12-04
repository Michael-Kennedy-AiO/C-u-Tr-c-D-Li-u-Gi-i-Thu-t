package com.tiendd2008110316.baitieuluancuoiky;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	static Scanner bienNhap = new Scanner(System.in);
	public static KhoHang kho = new KhoHang();
	
	public static void main(String[] args) {
		
		Date a = new Date();
		
		DienMay headDM = new DienMay(1, "1", 1, a);
		SanhSu headSS = new SanhSu(2, "2", 2, a);
		ThucPham headTP = new ThucPham(3, "3", 3, a);
		
		DienMay DM1 = new DienMay(4, "4", 4, a);
		headDM.next = DM1;
		SanhSu SS1 = new SanhSu(5, "5", 5, a);
		headSS.next = SS1;
		ThucPham TP1 = new ThucPham(6, "6", 6, a);
		headTP.next = TP1;
		
		DienMay DM2 = new DienMay(7, "7", 7, a);
		DM1.next = DM2;
		SanhSu SS2 = new SanhSu(8, "8", 9, a);
		SS1.next = SS2;
		ThucPham TP2 = new ThucPham(9, "9", 9, a);
		TP1.next = TP2;
		
		kho.headDienMay = headDM;
		kho.headSanhSu = headSS;
		kho.headThucPham = headTP;
		
		//DienMay headDienMay = new DienMay(1, "May xay sinh to", 0, 0, ngaynhapkho);
		
//		Date b = null;
//		System.out.println("aaaaa");
//		String date = bienNhap.nextLine();
//
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//		try {
//		    //Parsing the String
//			b = dateFormat.parse(date);
//		} catch (ParseException e) {
//		    // TODO Auto-generated catch block
//		    e.printStackTrace();
//		}
//		System.out.println(b);
		
		while (true){
        	System.out.println();
    		System.out.println("------------MENU---------");
            System.out.println("1)  Thêm hàng			|");
            System.out.println("2)  In danh sách hàng hóa	|");
            System.out.println("3)  Xóa hàng    		|");
            System.out.println("4)  Thêm táo tại táo bất kỳ    	|");
            System.out.println("5)  Tìm hàng    		|");
            System.out.println("6)  Thống kê kho hàng    		|");
            System.out.println("7)  Thoát            		|");
            System.out.println("-------------------------");
            System.out.print("Chọn chức năng: ");
            int key = bienNhap.nextInt();
            
            switch(key){
        	case 1:	ThemHang(kho);break;
        	case 2:	InTT(kho);break;
        	case 3:	XoaHang(kho);break;

        	case 5:	TimHang(kho);break;
        	case 6:	ThongKeKho(kho);break;
        	default: break;
        	}
		}
	}
	
	public static void ThemHang(KhoHang kho) {
		kho.ThemHang(bienNhap);
	}
	
	public static void InTT(KhoHang kho){
		kho.InTT();
	}
	
	public static void XoaHang(KhoHang kho) {
		kho.XoaHang(bienNhap);
	}
	
	public static void TimHang(KhoHang kho) {
		kho.TimHang(bienNhap);
	}
	
	public static void ThongKeKho(KhoHang kho) {
		kho.ThongKe(bienNhap);
	}
}
