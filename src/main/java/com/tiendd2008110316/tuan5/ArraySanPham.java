package com.tiendd2008110316.tuan5;

import java.util.Scanner;

public class ArraySanPham {

	public static Scanner bienNhap = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		SanPham[] DSSP = new SanPham[1];
		
		System.out.println("Danh sách đang trống, hãy thêm hàng vào danh sách");
		System.out.print("Hãy nhập tên hàng cần thêm: ");
		String a = bienNhap.nextLine();
		
		System.out.print("Hãy nhập giá sản phẩm: ");
		int giaSP = Integer.valueOf(bienNhap.nextLine());
		
		System.out.print("Hãy nhập giá giảm: ");
		int giamgia = Integer.valueOf(bienNhap.nextLine());
		
		System.out.print("Hãy nhập lượng thuế: ");
		float thue = Float.valueOf(bienNhap.nextLine());
		
		DSSP[0] = new SanPham(a, giaSP, giamgia, thue);
		

		
        while(true) {
        	
            System.out.println("---------------MENU----------------");
            System.out.println("1)  Thêm hàng vào danh sách        |");      
            System.out.println("2)  Xóa hàng ra khỏi danh sách     |");
            System.out.println("3)  Sắp xếp giảm dần theo giá      |");
            System.out.println("4)  Xuất giá trung bình của các SP |");
            System.out.println("5)  Xuất danh sách các sản phầm    |");
            System.out.println("-----------------------------------");
        	
        	int luachon = Integer.valueOf(bienNhap.nextLine());
        	System.out.println("Hãy chọn chức năng bạn muốn");
        	switch (luachon) {
			case 1:
				System.out.print("Nhap vi tri muon them: ");
				int vitri = Integer.valueOf(bienNhap.nextLine());
				DSSP = ThemSanPhamTaiViTriBatKi(DSSP, vitri);
				 break;
			case 2: 
				System.out.print("Nhap vi tri muon xoa: ");
				vitri = Integer.valueOf(bienNhap.nextLine());
				DSSP = XoaSanPhamTaiViTri(DSSP, vitri);
				break;
			case 3: DSSP = SapXepViTri(DSSP); break;
			case 4: System.out.println("Gia TB của các sản phẩm: "+ XuatGiaTB(DSSP)); break;
			case 5: XuatDS(DSSP); break;
			
			default:
				break;
			}
        }
	}

	
	static SanPham[] ThemSanPhamTaiViTriBatKi(SanPham[] DSSP, int vitri) {
		
		SanPham[] newList = new SanPham[DSSP.length+1];
		for (int i = 0; i < DSSP.length+1; i++) {
			if (i == vitri - 1) {
				System.out.print("Hãy nhập tên hàng cần thêm: ");
				String a = bienNhap.nextLine();
				
				System.out.print("Hãy nhập giá sản phẩm: ");
				int giaSP = Integer.valueOf(bienNhap.nextLine());
				
				System.out.print("Hãy nhập giá giảm: ");
				int giamgia = Integer.valueOf(bienNhap.nextLine());
				
				System.out.print("Hãy nhập lượng thuế: ");
				float thue = Float.valueOf(bienNhap.nextLine());
				
				newList[i] = new SanPham(a, giaSP, giamgia, thue);
				continue;
			}
			
			if (i > vitri - 1)
				newList[i] = DSSP[i-1];
			else
				newList[i] = DSSP[i];
				
		}
		
		
		return newList;
	}
	
	static SanPham[] XoaSanPhamTaiViTri(SanPham[] DSSP, int vitri) {
		SanPham[] newList = new SanPham[DSSP.length - 1];
		System.out.println("Đã xóa sản phẩm: "+ DSSP[vitri-1].tenSP);
		for (int i = 0; i < DSSP.length - 1; i++) {
			if (i >= vitri - 1) 
				newList[i] =  DSSP[i+1];
			else
				newList[i] =  DSSP[i];
		}
		return newList;
	}
	
	static SanPham[] SapXepViTri(SanPham[] DSSP) {
		
		for (int i = 0; i < DSSP.length; i++) {
			for (int j = 0; j < DSSP.length; j++) {
				if (DSSP[i].giaSP >= DSSP[j].giaSP) {
					SanPham k = DSSP[i];
					DSSP[i] = DSSP[j];
					DSSP[j] = k;
				}
			}
		}
		return null;
	}
	
	static int XuatGiaTB(SanPham[] DSSP) {
		int TB = 0;
		
		for (SanPham sanPham : DSSP) {
			TB += sanPham.giaSP;
		}
		return TB/DSSP.length;
	}
	
	static void XuatDS(SanPham[] DSSP) {
		for(SanPham sanpham : DSSP)
			sanpham.xuat();
	}
	
}
