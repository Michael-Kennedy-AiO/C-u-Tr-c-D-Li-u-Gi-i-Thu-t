package com.tiendd2008110316.tuan5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NhapXuatMangSapxepXoaDSSV {
    public static void main(String[] args) {
        do {
            Menu();
            System.out.print("Quay về MENU lựa chọn ?(y/n): ");
        } while(bienNhap.nextLine().equals("y"));
    }
    public static void Menu() {
        //Xuất Menu ra màn hình
        System.out.println("---------------MENU----------------");
        System.out.println("1)  Nhập Danh Sách Sinh Viên       |");      
        System.out.println("2)  Xuất Danh Sách Sinh Viên       |");
        System.out.println("3)  Sắp Xếp Danh Sách Sinh Viên    |");
        System.out.println("4)  Xuất Danh Sách SV Ngẫu Nhiên   |");
        System.out.println("5)  Xoá sinh vien                  |");
        System.out.println("6)  Kết Thúc.                      |");
        System.out.println("-----------------------------------");
        Scanner bienNhap = new Scanner(System.in);
        System.out.println("Chọn chức năng: ");
        int key = bienNhap.nextInt();
        switch(key){
            case 1:
                nhap();
                break;
            case 2:
                xuat();
                break;
            case 3:
                sapxep();
                break;
            case 4:
                xuatngaunhien();
                break;
            case 5:
            	xoaSV();
                break;
            case 6:
                System.out.println("Kết Thúc!");
                System.exit(0);
                break;
        }
    }
    
    //Tạo 1 ArrayList có tên là List kiểu String
    public static ArrayList<String>list = new ArrayList<String>();
    public static Scanner bienNhap = new Scanner(System.in);
    //Tạo Hàm nhập tên SV
    static void nhap(){
        while(true){
            System.out.print("Nhập họ và tên: ");
            String x = bienNhap.nextLine();
            list.add(x);
            System.out.print("Nhập thêm (y/n)?: ");
            if(bienNhap.nextLine().equals("n"))
            break;
        }
    }
    
    //Tạo Hàm xuất DS sinh viên ra màn hình
    public static void xuat(){
        for(String a: list){
        System.out.println("Họ và Tên: "+a);
        }
    }
    
    //Tạo Hàm sắp xếp sinh viên
    public static void sapxep(){
        Collections.sort(list);
        Collections.reverse(list);
        xuat();
    }
    
    //Tạo hàm xuất ngẫu nhiên 1 SV
    public static void xuatngaunhien(){
        Collections.shuffle(list);
        xuat();
    }
    
    //Tạo hàm xoá 1 SV
    public static void xoaSV(){
        System.out.println("Nhập tên cần xoá: ");
        String name = bienNhap.nextLine();
        for(String a: list){
            if(a.equals(name)){
            	System.out.println("Đã xoá " + a + " ra khỏi danh sách");
                list.remove(a);
            }
            break;
        }
    }
}
