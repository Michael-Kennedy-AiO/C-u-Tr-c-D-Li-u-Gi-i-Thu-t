package com.tiendd2008110316.tuan5;

public class SanPham {
	String tenSP;
	int giaSP;
	int giamgia;
	float thue;
	
	
	public SanPham(String tenSP, int giaSP, int giamgia, float thue) {
		this.tenSP = tenSP;
		this.giaSP = giaSP;
		this.giamgia = giamgia;
		this.thue = thue;
	}
	
	
	void xuat() {
		System.out.println("Tên sản phẩm: "+ tenSP + " -----> Giá: "+giaSP+" ----> Giảm giá: "+giamgia+" -----> Thuế: "+thue);
	}
	
}
