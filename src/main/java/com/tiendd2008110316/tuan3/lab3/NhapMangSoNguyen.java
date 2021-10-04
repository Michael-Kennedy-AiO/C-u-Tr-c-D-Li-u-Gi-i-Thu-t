package com.tiendd2008110316.tuan3.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class NhapMangSoNguyen {
	public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = bienNhap.nextInt();
        int a[] = new int[n];
        for(int i = 0;i < n;i++){
            System.out.printf("A[%d]= ", i);
            a[i] = bienNhap.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0;i < n;i++){
            System.out.println();
            System.out.printf("A[%d]= %d", i,a[i]);    
        }
        int Min = a[0];
        for(int x : a){
            Math.min(Min, x);
        }
        System.out.println("\n\nPhần tử nhỏ nhất trong mảng là: " + Min);
        int tong = 0;
        int dem = 0;
        for(int x : a){
            if(x % 3 == 0){
                tong += x;
                dem++;
            }      
        }
        System.out.printf("\nTrung bình cộng các số chia hết cho 3 = %d", tong/dem);
        bienNhap.close();  
    }  
}
