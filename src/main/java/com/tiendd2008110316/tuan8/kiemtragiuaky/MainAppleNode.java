package com.tiendd2008110316.tuan8.kiemtragiuaky;

import java.util.Scanner;

public class MainAppleNode {
	
	public static Scanner bienNhap = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Chưa có táo nào được thêm hãy thêm 1 trái táo nào!!!");
		System.out.print("Hãy nhập ID táo: ");
		int id = bienNhap.nextInt();
		
		System.out.print("Hãy nhập KL táo: ");
		float KL = bienNhap.nextFloat();
		
		System.out.print("Hãy nhập màu táo: ");
		bienNhap.nextLine();
		String color = bienNhap.nextLine();
		
		AppleNode apple = new AppleNode(id, KL, color);
		AppleNode head = apple;
        while (true){
        	System.out.println();
    		System.out.println("------------MENU---------");
            System.out.println("1)  Thêm táo			|");
            System.out.println("2)  Tìm táo theo Id		|");
            System.out.println("3)  In danh sách táo    	|");
            System.out.println("4)  Thêm táo tại táo bất kỳ    	|");
            System.out.println("6)  Thoát            		|");
            System.out.println("-------------------------");
            System.out.print("Chọn chức năng: ");
            int key = bienNhap.nextInt();
        	
        	switch(key){
        	case 1:	head = ThemTaoVaoDau(head);break;
        	case 2: 
        		System.out.println("Nhập ID táo muốn tìm: ");
        		int idTao = bienNhap.nextInt();
        		
        		if (TimTaoTheoID(head, idTao) == null)
        			System.out.println("Không có táo nào có ID: "+idTao);
        		else
        			TimTaoTheoID(head, idTao).inTT();
        		break;
        	case 3: inDStao(head);break;
        	case 4: XoaTaoCuoiDanhSach(head);break;
        	default: break;
        	}
        }
	}
	
	public static AppleNode ThemTaoVaoDau(AppleNode apple) {
		
		System.out.print("Hãy nhập ID táo: ");
		int id = bienNhap.nextInt();
		
		System.out.print("Hãy nhập KL táo: ");
		float KL = bienNhap.nextFloat();
		
		System.out.print("Hãy nhập màu táo: ");
		bienNhap.nextLine();
		String color = bienNhap.nextLine();
		AppleNode newApple = new AppleNode(id, KL, color);
		newApple.next = apple;
		
		return newApple;
	}
	public static void ThemTaoVaoCuoi(AppleNode head) {
		AppleNode cur = head;
		while (cur != null) {
			cur = cur.next;
		}
		
		System.out.println("Hãy nhập ID táo: ");
		int id = bienNhap.nextInt();
		
		System.out.println("Hãy nhập KL táo: ");
		float KL = bienNhap.nextFloat();
		
		System.out.println("Hãy nhập ID táo: ");
		String color = bienNhap.nextLine();
		AppleNode newApple = new AppleNode(id, KL, color);
		
		cur.next = newApple;
	}
	
	public static AppleNode TimTaoTheoID(AppleNode head, int idTao) {
		AppleNode cur = head;
		
		while (cur != null) {
			if (cur.id == idTao) {
				return cur;
			}
			cur = cur.next;
		}
		
		return null;
	}
	
	public static void inDStao(AppleNode head) {
		AppleNode cur = head;
		while (cur != null) {
			cur.inTT();
			cur = cur.next;
		}
	}
	
	public static void XoaTaoCuoiDanhSach(AppleNode head) {
		AppleNode cur = head;
		while (cur.next != null) {
			if (cur.next.next == null)
				cur.next = null;
		}
		System.out.println("Da xoa");
	}
	
	public static void ThemTaoTruoc1TaoBatKy(AppleNode head, int idTao) {
		AppleNode vitri = TimTaoTheoID(head, idTao);
		AppleNode cur = head;
		while (cur != null) {
			if (cur.next == vitri) {
				System.out.println("Hãy nhập ID táo: ");
				int id = bienNhap.nextInt();
				
				System.out.println("Hãy nhập KL táo: ");
				float KL = bienNhap.nextFloat();
				
				System.out.println("Hãy nhập ID táo: ");
				bienNhap.nextLine();
				String color = bienNhap.nextLine();
				AppleNode newApple = new AppleNode(id, KL, color);
				newApple.next = vitri;
				cur.next = newApple;
			}
		}
	}
}
