package com.tiendd2008110316.tuan5;

import com.tiendd2008110316.tuan5.SanPham;
import java.util.ArrayList;
import java.util.Scanner;

public class SanPhamDrive {
	public static ArrayList<SanPham> listSP = new ArrayList();
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		nhapSP();
		
		
	}
	
	
	public static void nhapSP() {
		while(true) {
			System.out.print("Nhap ten san pham: ");
			String tensp = input.nextLine();
			
			System.out.print("Nhap gia san pham: ");
			int giasp = Integer.valueOf(input.nextLine());
			
			System.out.print("Nhap giam gia cua san pham: ");
			int giamgia = Integer.valueOf(input.nextLine());
			
			System.out.print("Nhap thue san pham: ");
			int thue = Integer.valueOf(input.nextLine());
			
			listSP.add(new SanPham(tensp, giasp, giamgia, thue));
			
			System.out.print("Co them san pham nua khong? Yes: 1 ---- No : 0 ----->");
			if (Integer.valueOf(input.nextLine()) == 0) 
				break;
			
			System.out.println("\n");
		}
	}
	
	
	public static void xuatSP() {
		
	}
	
	
}
