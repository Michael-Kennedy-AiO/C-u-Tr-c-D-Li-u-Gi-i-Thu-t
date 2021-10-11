package com.tiendd2008110316.tuan4.lab4;

import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class QuanLySanPham {
    public static void main(String[] args) {
        menu();
    }

    //Tạo một ArrayList tên list kiểu String
    public static ArrayList <String> list = new ArrayList<String>();
    public static Scanner bienNhap = new Scanner(System.in);

    public static void menu(){
        System.out.println("------------------MENU------------------");
        System.out.println("=> 1)  Nhập danh sách sản phẩm                  |");
        System.out.println("=> 2)  Sắp xếp giảm dần theo giá        	|");
        System.out.println("=> 3)  Xoá sản phẩm vừa nhập            	|");
        System.out.println("=> 4)  Xuất giá trung bình của các sản phẩm     |");
        System.out.println("=> 5)  Kết thúc                         	|");
        System.out.println("----------------------------------------");
        System.out.println("Chọn chức năng: ");
        int key = bienNhap.nextInt();
        switch(key){
            case 1:
                nhap();
            break;
            case 2:
            break;
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
            System.out.print("Nhập tên sản phẩm: ");
            String x = bienNhap.nextLine();
            list.add(x);
            System.out.print("Nhập thêm (y/n)?: ");
            if(bienNhap.nextLine().equals("n"))
            break;
        }
    }

    public static void xuat(){
        for(String a: list){
            System.out.println("Sản Phẩm: "+a);
            }
    }

    public static void sapxepgiamdan(){
        
    }
}
