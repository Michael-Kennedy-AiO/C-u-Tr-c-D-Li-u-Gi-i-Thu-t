package com.tiendd2008110316.tuan4.lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class XuatVaCongSooThuc {
    public static void main(String[] args) {
    	
    	
        //Khai báo 1 ArrayList có tên là danhsach, có kiểu là Double
        ArrayList<Double>danhsach = new ArrayList<Double>();
        Scanner bienNhap = new Scanner(System.in);
        
        //Nhập các phần từ vào list
        for(int i = 0; i < 5; i++){
        System.out.println("Nhập phần tử trong mảng: " +i+ " > ");
        danhsach.add(bienNhap.nextDouble());
        }
        
        
        //Xuất các phần từ theo chuỗi(String) của list ra màn hình
        for(int i = 0; i < 5; i++){
            System.out.println("Xuất phần tử trong mảng: ");
            System.out.println(danhsach.toString());
            break;
        }
        
        
        double sum = 0;
        //Cộng tất cả các phần tử đã nhập của list và in ra màn hình
        for(int i = 0; i < 5; i++)
            sum += danhsach.get(i);
        System.out.println("Tổng của các phần tử vừa nhập: "+sum);
    }
}

