package com.tiendd2008110316.tuan4.lab4;

import java.util.ArrayList;
import java.util.Scanner;


public class QuanLySanPham {
    public static void main(String[] args) {
        menu();
    }

    //Tạo một ArrayList tên list kiểu String
    public static ArrayList <String> list = new ArrayList<String>();
    public static ArrayList <Integer> gia = new ArrayList<Integer>();
    
    public static Scanner bienNhap = new Scanner(System.in);
    
    
    public static void menu(){
        System.out.println("------------------MENU------------------");
        System.out.println("=> 1)  Nhập danh sách sản phẩm                  |");
        System.out.println("=> 2)  Sắp xếp giảm dần theo giá        	|");
        System.out.println("=> 3)  Xoá sản phẩm vừa nhập            	|");
        System.out.println("=> 4)  Xuất giá trung bình của các sản phẩm     |");
        System.out.println("=> 5)  Kết thúc                         	|");
        System.out.println("----------------------------------------");
        System.out.print("Chọn chức năng: ");
        int key = Integer.valueOf(bienNhap.nextLine());
        switch(key){
            case 1:	nhap();break;
            case 2: sapxepgiamdan();break;
            case 3:
            break;
            case 4:
            break;
            case 5:
            break;
        }
    }

    public static void nhap(){
        while(true){
            System.out.print("\nNhập tên sản phẩm: ");
            String x = bienNhap.nextLine();
            list.add(x);
            
            System.out.print("Nhập giá: ");
            int value = Integer.valueOf(bienNhap.nextLine());
            gia.add(value);
            
            System.out.print("Nhập thêm (y/n)?: ");
            if(bienNhap.nextLine().equals("n"))
            	menu();
        }
    }
    
    public static void xuat() {
    	
    	for(int i = 0; i < list.size(); i++) {
    		System.out.println("Sản phẩm: "+list.get(i)+" 	Giá: "+gia.get(i)+"VND");
    	}
    }
    

    public static void sapxepgiamdan(){
        for (int i = 0; i < list.size(); i++) {
        	for (int j = i; j < gia.size(); j++) {
//        		if (Integer.valueOf(gia.get(j)) > Integer.valueOf(gia.get(j+1))) {
//        			int giaca = gia.get(j);
//        			gia.set(j, gia.get(j+1));
//        			gia.set(j+1, giaca);
//        			
//        			String tenSP = list.get(j);
//        			list.set(j, list.get(j+1));
//        			list.set(j+1, tenSP);
//        		}
        	}
        }
        System.err.println(gia.get(0) - gia.get(1));
        xuat();
    }
    
    
    public static void xoaSanPham() {
    	
    }
    
}
