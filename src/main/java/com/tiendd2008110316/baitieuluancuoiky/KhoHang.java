package com.tiendd2008110316.baitieuluancuoiky;

import java.util.Scanner;

public class KhoHang {
	DienMay headDienMay;
	SanhSu headSanhSu;
	ThucPham headThucPham;
	
	KhoHang(){
		
	}
	
	KhoHang (DienMay _headDienMay, SanhSu _headSanhSu, ThucPham _headThucPham){
		headDienMay = _headDienMay;
		headSanhSu = _headSanhSu;
		headThucPham = _headThucPham;
	}
	
	public void ThemHang(Scanner scanner) {
		System.out.println("Bạn muốn thêm loại hàng nào?");
		System.out.print("1) Điện máy	2) Sành Sứ	3) Thực Phẩm ----> Lựa chọn: ");
		
		int loaiHang = scanner.nextInt();
		
		if (loaiHang == 1) {
			DienMay cur = headDienMay;
			while (cur != null) {
				if (cur.next == null) {
					DienMay itemMoi = new DienMay();
					itemMoi.id = NhapId(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
				cur = cur.next;
			}
		}
		
		if (loaiHang == 2) {
			SanhSu cur = headSanhSu;
			while (cur != null) {
				if (cur.next == null) {
					SanhSu itemMoi = new SanhSu();
					itemMoi.id = NhapId(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
			}
			cur = cur.next;
		}

		if (loaiHang == 3) {
			ThucPham cur = headThucPham;
			while (cur != null) {
				if (cur.next == null) {
					ThucPham itemMoi = new ThucPham();
					itemMoi.id = NhapId(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
			}
			cur = cur.next;
		}
	}
	
	
	
	int NhapId(Scanner scanner, int loaihang) {
		
		System.out.print("Hãy nhập ID hàng: ");
		int id = scanner.nextInt();
		
		if (loaihang == 1) {
			DienMay cur = headDienMay;
			while (cur != null) {
				if (cur.id == id) {
					System.out.println("Id này đã tồn tại");
					return NhapId(scanner, loaihang);
				}
				cur = cur.next;
			}
		}
		
		if (loaihang == 2) {
			SanhSu cur = headSanhSu;
			while (cur != null) {
				if (cur.id == id) {
					System.out.print("Id này đã tồn tại");
					return NhapId(scanner, loaihang);
				}
				cur = cur.next;
			}
		}
		
		if (loaihang == 3) {
			ThucPham cur = headThucPham;
			while (cur != null) {
				if (cur.id == id) {
					System.out.print("Id này đã tồn tại");
					return NhapId(scanner, loaihang);
				}
				cur = cur.next;
			}
		}
		return id;
	}
	
	public void InTT(){
		DienMay curDM = headDienMay;
		SanhSu curSS = headSanhSu;
		ThucPham curTP = headThucPham;
		
		while (curDM != null) {
			curDM.inTT();
			curDM = curDM.next;
		}
		
		System.out.println();
		
		while (curSS != null) {
			curSS.inTT();
			curSS = curSS.next;
		}
		
		System.out.println();
		
		while (curTP != null) {
			curTP.inTT();
			curTP = curTP.next;
		}
		
	}
	
	public void XoaHang(Scanner scanner) {
		System.out.println("Muốn xóa theo cách nào");
		System.out.print("1) Theo Id	2) Theo tên	3) Theo giá ----> Lựa chọn: ");
		
		int cachxoa = scanner.nextInt();
		
		if (cachxoa == 1) {
			System.out.print("Hãy nhập Id hàng cần xóa: ");
			int idCanXoa = scanner.nextInt();
			
			if (headDienMay.id == idCanXoa) {
				headDienMay = headDienMay.next;
				return;
			}
			
			if (headSanhSu.id == idCanXoa) {
				headSanhSu = headSanhSu.next;
				return;
			}
			
			if (headThucPham.id == idCanXoa) {
				headThucPham = headThucPham.next;
				return;
			}
			
			DienMay curDM = headDienMay;
			SanhSu curSS = headSanhSu;
			ThucPham curTP = headThucPham;
			
			while (curDM.next != null) {
				if (curDM.next.id == idCanXoa) {
					curDM.next = curDM.next.next;
					return;
				}
				curDM = curDM.next;
			}
			
			while (curSS.next != null) {
				if (curSS.next.id == idCanXoa) {
					curSS.next = curSS.next.next;
					return;
				}
				curSS = curSS.next;
			}
			
			while (curTP != null) {
				if (curTP.next.id == idCanXoa) {
					curTP.next = curTP.next.next;
					return;
				}
				curTP = curTP.next;
			}
			System.out.println("Đã xóa");
		}
		
		if (cachxoa == 2) {
			System.out.print("Hãy nhập tên hàng cần xóa: ");
			scanner.nextLine();
			String idCanXoa = scanner.nextLine();
			
			if (headDienMay.name.equalsIgnoreCase(idCanXoa)) {
				headDienMay = headDienMay.next;
				return;
			}
			
			if (headSanhSu.name.equalsIgnoreCase(idCanXoa)) {
				headSanhSu = headSanhSu.next;
				return;
			}
			
			if (headThucPham.name.equalsIgnoreCase(idCanXoa)) {
				headThucPham = headThucPham.next;
				return;
			}
			
			DienMay curDM = headDienMay;
			SanhSu curSS = headSanhSu;
			ThucPham curTP = headThucPham;
			
			while (curDM.next != null) {
				if (curDM.next.name.equalsIgnoreCase(idCanXoa)) {
					curDM.next = curDM.next.next;
					return;
				}
				curDM = curDM.next;
			}
			
			while (curSS.next != null) {
				if (curSS.next.name.equalsIgnoreCase(idCanXoa)) {
					curSS.next = curSS.next.next;
					return;
				}
				curSS = curSS.next;
			}
			
			while (curTP != null) {
				if (curTP.next.name.equalsIgnoreCase(idCanXoa)) {
					curTP.next = curTP.next.next;
					return;
				}
				curTP = curTP.next;
			}
			System.out.println("Đã xóa");
		}

		if (cachxoa == 3) {
			
		}
		
		
		
		
		
	}
	
	
	
	private void XoaHangTheoTen() {
		
	}
	
	
}
