package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {

	static Scanner bienNhap = new Scanner(System.in);
	public static KhoHang kho = new KhoHang();
	
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Random rd = new Random();
		
//		Date headDMdate = null;
//		String date = "15-01-1999";
//		try {
//		    //Parsing the String
//			headDMdate = dateFormat.parse(date);
//		} catch (ParseException e) {
//		    // TODO Auto-generated catch block
//		    e.printStackTrace();
//		}
		
		
		Date a = null;
		String date = "02-05-1990";
		try {
			a = dateFormat.parse(date);
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		DienMay headDM = new DienMay(1, "1", 1, a);
		
		date = "15-01-1999";
		try {
			a = dateFormat.parse(date);
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		SanhSu headSS = new SanhSu(2, "2", 2, a);
		
		date = "23-11-2020";
		try {
			a = dateFormat.parse(date);
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		ThucPham headTP = new ThucPham(3, "3", 3, a);
		
		DienMay curDM = headDM;
		SanhSu curSS = headSS;
		ThucPham curTP = headTP;
		
		for (int i = 0; i < 12; i+=3) {
			for (int j = 0; j < 3; j++) {
				date = Integer.toString(rd.nextInt(28))+"-"+Integer.toString(rd.nextInt(12))+"-"+Integer.toString(rd.nextInt(20)+2000);
				if (j == 0) {
					try {
						a = dateFormat.parse(date);
					} catch (ParseException e) {
					    e.printStackTrace();
					}
					DienMay newNode = new DienMay(i+j+4, Integer.toString(i+j+4), i+j+4, a);
					curDM.next = newNode;
				}
				
				if (j == 1) {
					try {
						a = dateFormat.parse(date);
					} catch (ParseException e) {
					    e.printStackTrace();
					}
					SanhSu newNode = new SanhSu(i+j+4, Integer.toString(i+j+4), i+j+4, a);
					curSS.next = newNode;
				}
				
				if (j == 2) {
					try {
						a = dateFormat.parse(date);
					} catch (ParseException e) {
					    e.printStackTrace();
					}
					ThucPham newNode = new ThucPham(i+j+4, Integer.toString(i+j+4), i+j+4, a);
					curTP.next = newNode;
				}
			}
			curDM = curDM.next;
			curSS = curSS.next;
			curTP = curTP.next;
		}
		
//		DienMay DM1 = new DienMay(4, "4", 4, a);
//		headDM.next = DM1;
//		SanhSu SS1 = new SanhSu(5, "5", 5, a);
//		headSS.next = SS1;
//		ThucPham TP1 = new ThucPham(6, "6", 6, a);
//		headTP.next = TP1;
//		
//		DienMay DM2 = new DienMay(7, "7", 7, a);
//		DM1.next = DM2;
//		SanhSu SS2 = new SanhSu(8, "8", 9, a);
//		SS1.next = SS2;
//		ThucPham TP2 = new ThucPham(9, "9", 9, a);
		//TP1.next = TP2;
		
		kho.headDienMay = headDM;
		kho.headSanhSu = headSS;
		kho.headThucPham = headTP;
		
		System.out.println(headSS.ngayNhapKho.getYear());
		
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
            System.out.println("4)  Sửa thông tin hàng hóa    	|");
            System.out.println("5)  Tìm hàng    		|");
            System.out.println("6)  Thống kê kho hàng    	|");
            System.out.println("7)  Sắp xếp kho hàng    	|");
            System.out.println("8)  Thoát            		|");
            System.out.println("-------------------------");
            System.out.print("Chọn chức năng: ");
            int key = bienNhap.nextInt();
            
            switch(key){
        	case 1:	ThemHang(kho);break;
        	case 2:	InTT(kho);break;
        	case 3:	XoaHang(kho);break;
        	case 4: SuaHang(kho); break;
        	case 5:	TimHang(kho);break;
        	case 6:	ThongKeKho(kho);break;
        	case 7:	SapXepKhoHang(kho);break;
        	default: System.out.println("Bạn đã nhập sai"); break;
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
	
	public static void SuaHang(KhoHang kho) {
		kho.SuaHang(bienNhap);
	}
	
	public static void SapXepKhoHang(KhoHang kho) {
		kho.SapXep(bienNhap);
	}
}
