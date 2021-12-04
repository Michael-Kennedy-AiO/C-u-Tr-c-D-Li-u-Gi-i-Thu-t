package com.tiendd2008110316.baitieuluancuoiky;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class KhoHang {
	DienMay headDienMay;
	SanhSu headSanhSu;
	ThucPham headThucPham;
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
	
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
		}else if (loaiHang == 2) {
			SanhSu cur = headSanhSu;
			while (cur != null) {
				if (cur.next == null) {
					SanhSu itemMoi = new SanhSu();
					itemMoi.id = NhapId(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
				cur = cur.next;
			}
		}else if (loaiHang == 3) {
			ThucPham cur = headThucPham;
			while (cur != null) {
				if (cur.next == null) {
					ThucPham itemMoi = new ThucPham();
					itemMoi.id = NhapId(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
				cur = cur.next;
			}
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
	
	public void TimHang(Scanner scanner) {
		System.out.println("Muốn tìm hàng theo cách nào");
		System.out.print("1) Theo loại	2) Theo giá	3) Theo ngày nhập ----> Lựa chọn: ");
		
		int cachtim = scanner.nextInt();
		
		
		if (cachtim == 1) {
			System.out.println("\nHãy nhập Loại hàng bạn muốn tìm");
			System.out.print("1) Điện máy	2) Sành sứ	3) Thực phẩm ----> Lựa chọn: ");
			int loai = scanner.nextInt();
			
			if (loai == 1) {
				DienMay cur = headDienMay;
				while (cur != null) {
					cur.inTT();
					cur = cur.next;
				}
			}else if (loai == 2) {
				SanhSu cur = headSanhSu;
				while (cur != null) {
					cur.inTT();
					cur = cur.next;
				}
			}else if (loai == 3) {
				ThucPham cur = headThucPham;
				while (cur != null) {
					cur.inTT();
					cur = cur.next;
				}
			}
			
			
		}else if (cachtim == 2) {
			System.out.print("Hãy nhập khoảng giá của hàng bạn muốn tìm\nTừ: ");
			float start = scanner.nextFloat();
			System.out.print("Đến: ");
			float end = scanner.nextFloat();
			
			DienMay curDM = headDienMay;
			SanhSu curSS = headSanhSu;
			ThucPham curTP = headThucPham;
			
			while (curDM != null) {
				if (curDM.gia >= start && curDM.gia <= end)
					curDM.inTT();
				curDM = curDM.next;
			}
			System.out.println();
			
			while (curSS != null) {
				if (curSS.gia >= start && curSS.gia <= end)
					curSS.inTT();
				curSS = curSS.next;
			}
			System.out.println();
			
			while (curTP != null) {
				if (curTP.gia >= start && curTP.gia <= end)
					curTP.inTT();
				curTP = curTP.next;
			}
			
		}else if (cachtim == 3) {
			System.out.println("Hãy nhập khoảng ngày nhập kho sản phẩm bạn muốn tìm (dd-mm-yyyy)\nTừ ngày: ");
			String date = scanner.nextLine();
			Date startDate;
			try {
				startDate = dateFormat.parse(date);
			} catch (ParseException e) {
				System.err.println("Bạn đã nhập sai mẫu ngày hãy chọn (Tìm hàng ở Menu và thao tác lại)");
				return;
			}
			
			System.out.println("Đến ngày: ");
			Date endDate;
			try {
				endDate = dateFormat.parse(date);
			} catch (ParseException e) {
				System.err.println("Bạn đã nhập sai mẫu ngày hãy chọn (Tìm hàng ở Menu và thao tác lại)");
				return;
			}
			
			DienMay curDM = headDienMay;
			while (curDM != null) {
				if (curDM.ngayNhapKho.compareTo(startDate) >= 0 && curDM.ngayNhapKho.compareTo(startDate) <= 0) 
					curDM.inTT();
				
				curDM = curDM.next;
			}
			System.out.println();
			SanhSu curSS = headSanhSu;
			while (curSS != null) {
				if (curSS.ngayNhapKho.compareTo(startDate) >= 0 && curSS.ngayNhapKho.compareTo(startDate) <= 0) 
					curSS.inTT();
				
				curSS = curSS.next;
			}
			System.out.println();
			ThucPham curTP = headThucPham;
			while (curTP != null) {
				if (curTP.ngayNhapKho.compareTo(startDate) >= 0 && curTP.ngayNhapKho.compareTo(startDate) <= 0) 
					curTP.inTT();
				
				curTP = curTP.next;
			}
		}
	}
	
	public void ThongKe(Scanner scanner) {
		int tongSLHang;
		int tongSLDienMay = 0;
		int tongSLSanhSu = 0;
		int tongSLThucPham = 0;
		
		float tongGiaTri = 0;
		float tongGiaTriDienMay = 0;
		float tongGiaTriSanhSu = 0;
		float tongGiaTriThucPham = 0;
		
		DienMay curDM = headDienMay;
		SanhSu curSS = headSanhSu;
		ThucPham curTP = headThucPham;
		
		while (curDM != null) {
			tongSLDienMay++;
			tongGiaTriDienMay += curDM.gia;
			curDM = curDM.next;
		}
		
		while (curSS != null) {
			tongSLSanhSu++;
			tongGiaTriSanhSu += curSS.gia;
			curSS = curSS.next;
		}
		
		while (curTP != null) {
			tongSLThucPham++;
			tongGiaTriThucPham += curTP.gia;
			curTP = curTP.next;
		}
		
		tongSLHang = tongSLDienMay + tongSLSanhSu + tongSLThucPham;
		tongGiaTri = tongGiaTriDienMay + tongGiaTriSanhSu + tongGiaTriThucPham;
		
		System.out.println("Tổng số lượng hàng hóa trong kho: " + tongSLHang + " sản phẩm");
		System.out.println("Tổng giá trị nhập kho: " + tongGiaTri + "VND\n");
		
		System.out.println("Điện máy có: " + tongSLDienMay + " sản phẩm");
		System.out.println("Sành sứ có: " + tongSLSanhSu + " sản phẩm");
		System.out.println("Thực phẩm có: " + tongSLThucPham + " sản phẩm");
		
	}
	
	private void XoaHangTheoTen() {
		
	}
	
	
}
