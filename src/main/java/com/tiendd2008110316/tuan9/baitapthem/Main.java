package com.tiendd2008110316.tuan9.baitapthem;

import java.util.Scanner;

import com.tiendd2008110316.tuan9.baitapthem.Apple;

public class Main {
	public static Scanner bienNhap = new Scanner(System.in);
	public static void main(String[] args) {
//		System.out.println("Chưa có táo nào được thêm hãy thêm 1 trái táo nào!!!");
//		System.out.print("Hãy nhập ID táo: ");
//		int id = bienNhap.nextInt();
//		
//		System.out.print("Hãy nhập KL táo: ");
//		float KL = bienNhap.nextFloat();
//		
//		System.out.print("Hãy nhập màu táo: ");
//		bienNhap.nextLine();
//		String color = bienNhap.nextLine();
		
		Apple apple = new Apple(2, 2, "2");
		Apple head = apple;
		
		Apple apple1 = new Apple(3, 3, "3");
		apple.next = apple1;
		
		Apple apple2 = new Apple(1, 1, "1");
		apple1.next = apple2;
		
		Apple apple3 = new Apple(4, 4, "4");
		apple2.next = apple3;
		
		
        while (true){
        	System.out.println();
    		System.out.println("------------MENU---------");
            System.out.println("1)  Thêm táo vào đầu danh sách		|");
            System.out.println("2)  Thêm táo vào cuối danh sách		|");
            System.out.println("3)  Tìm táo theo Id			|");
            System.out.println("4)  In danh sách táo    		|");
            System.out.println("5)  Thêm táo tại táo bất kỳ    		|");
            System.out.println("6)  Xóa táo cuối danh sách   		|");
            System.out.println("7)  Xóa táo đầu danh sách   		|");
            System.out.println("10)  Thoát            			|");
            System.out.println("-------------------------");
            System.out.print("Chọn chức năng: ");
            int key = bienNhap.nextInt();
        	
        	switch(key){
        	case 1:	head = ThemTaoVaoDau(head); break;
        	case 2:	ThemTaoVaoCuoi(head); break;
        	case 3: 
        		Apple testApple = TimTaoTheoID(head);
        		if (testApple == null)
        			System.out.println("Không tìm thấy táo");
        		else
        			testApple.inTT();
        		break;
        	case 4: inDStao(head); break;
        	case 5: ThemTaoTruoc1TaoBatKy(head); break;
        	case 6: XoaTaoCuoiDanhSach(head); break;
        	case 7: head = XoaTaoDauDanhSach(head); break;
        	default: break;
        	}
        }
	}
	
	public static Apple ThemTaoVaoDau(Apple apple) {
		
		System.out.print("Hãy nhập ID táo: ");
		int id = bienNhap.nextInt();
		
		System.out.print("Hãy nhập KL táo: ");
		float KL = bienNhap.nextFloat();
		
		System.out.print("Hãy nhập màu táo: ");
		bienNhap.nextLine();
		String color = bienNhap.nextLine();
		Apple newApple = new Apple(id, KL, color);
		newApple.next = apple;
		
		return newApple;
	}
	
	public static void ThemTaoVaoCuoi(Apple head) {
		Apple cur = head;
		while (cur.next != null) {
			cur = cur.next;
		}
		
		System.out.print("Hãy nhập ID táo: ");
		int id = bienNhap.nextInt();
		
		System.out.print("Hãy nhập KL táo: ");
		float KL = bienNhap.nextFloat();
		
		System.out.print("Hãy nhập màu táo: ");
		bienNhap.nextLine();
		String color = bienNhap.nextLine();
		Apple newApple = new Apple(id, KL, color);
		
		cur.next = newApple;
		//newApple.pre = cur;
	}
	
	public static Apple TimTaoTheoID(Apple head) {
		System.out.print("Nhập ID táo muốn tìm: ");
		int idTao = bienNhap.nextInt();
		
		Apple cur = head;
		while (cur != null) {
			if (cur.id == idTao) {
				return cur;
			}
			cur = cur.next;
		}
		return null;
	}
	
	public static void inDStao(Apple head) {
		Apple cur = head;
		while (cur != null) {
			cur.inTT();
			cur = cur.next;
		}
	}
	
	public static void XoaTaoCuoiDanhSach(Apple head) {
		Apple cur = head;
		while (cur.next != null) {
			if (cur.next.next == null) {
				cur.next = null;
				break;
			}
			cur = cur.next;
		}
		System.out.println("Da xoa");
	}
	
	public static Apple XoaTaoDauDanhSach(Apple head) {
		System.out.println("Da Xoa");
		return head.next;
	}
	
	public static void ThemTaoTruoc1TaoBatKy(Apple head) {
		Apple vitri = TimTaoTheoID(head);
		Apple cur = head;
		while (cur != null) {
			if (cur.next == vitri) {
				System.out.print("Hãy nhập ID táo: ");
				int id = bienNhap.nextInt();
				
				System.out.print("Hãy nhập KL táo: ");
				float KL = bienNhap.nextFloat();
				
				System.out.print("Hãy nhập ID táo: ");
				bienNhap.nextLine();
				String color = bienNhap.nextLine();
				
				Apple newApple = new Apple(id, KL, color);
				newApple.next = vitri;
				//vitri.pre = newApple;
				
				cur.next = newApple;
				//newApple.pre = cur;
				break;
			}
			cur = cur.next;
		}
	}
	
	public static void SapXepTangDan(Apple head) {
		
		Apple cur = head;
		Apple newHead = head;
		Apple countEnd = head;
		Apple nextHead;
		
		//while (countEnd != null) {
			while (cur.next != null) {
				if (newHead.KL > cur.next.KL) {
					nextHead = newHead.next;
					Apple swapApple = cur.next;
					newHead.next = swapApple.next;
					cur.next = newHead;
					swapApple.next = nextHead;
					head = swapApple;
					inDStao(head);
				}
				cur = cur.next;
			}
			//countEnd = countEnd.next;
			//cur = countEnd;
		//}
		
	}
	
	public static void SapXepGiamDan(Apple head) {
		
		
		
	}
	
	public static void selectionSort(int []arr){ 
        for(int i = 0 ; i < arr.length - 1; i++){
            int index = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
	
	public static int GetListLength(Apple head) {
		int count = 0;
		
		Apple cur = head;
		while (cur != null) {
			cur = cur.next;
			count++;
		}
		return count;
	}
}
