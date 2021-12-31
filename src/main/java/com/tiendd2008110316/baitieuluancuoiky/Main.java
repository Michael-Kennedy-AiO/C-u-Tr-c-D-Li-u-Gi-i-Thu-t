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
		
		for (int i = 0; i < 18; i+=3) {
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
		kho.headDienMay = headDM;
		kho.headSanhSu = headSS;
		kho.headThucPham = headTP;
		while (true){
        	System.out.println();
    		System.out.println("------------MENU---------");
            System.out.println("1)  Thêm hàng			|");
            System.out.println("2)  In danh sách hàng hóa	|");
            System.out.println("3)  Xóa hàng    		|");
            System.out.println("4)  Sửa thông tin hàng hóa    	|");
            System.out.println("5)  Tìm hàng    		|");
            System.out.println("6)  Thống kê kho hàng    	|");
            System.out.println("7)  Thoát            		|");
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
        	case 7: System.out.println("Thoát chương trình ....."); return;
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
}
