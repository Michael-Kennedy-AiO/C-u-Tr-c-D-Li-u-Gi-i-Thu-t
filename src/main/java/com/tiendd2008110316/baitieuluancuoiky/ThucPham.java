package com.tiendd2008110316.baitieuluancuoiky;

import java.util.Date;
import java.util.Scanner;

public class ThucPham {
	int id;
	String name;
	float gia;
	Date ngayNhapKho;
	
	ThucPham next;
	
	ThucPham(){
		
	}
	
	ThucPham(int _id, String _name, float _gia, Date _ngayNhapKho){
		id = _id;
		name = _name;
		gia = _gia;
		ngayNhapKho = _ngayNhapKho;
	}
	
	public void NhapTT(Scanner scanner) {
		
		scanner.nextLine();
		System.out.print("Nhập tên sản phẩm: ");
		name = scanner.nextLine();
		
		System.out.print("Hãy nhập giá sản phẩm: ");
		gia = scanner.nextFloat();
		
		ngayNhapKho = new Date();
	}
	
	public void inTT() {
		System.out.println("Tên hàng: " +name+ ", Loại hàng: Thực Phẩm, Id: " +id+ ", Giá: " +gia+ ", Ngày nhập: "+ngayNhapKho);
	}
}