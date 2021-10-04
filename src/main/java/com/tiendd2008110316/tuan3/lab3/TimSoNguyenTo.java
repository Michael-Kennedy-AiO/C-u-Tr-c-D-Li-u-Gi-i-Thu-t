package com.tiendd2008110316.tuan3.lab3;

import java.util.Scanner;

public class TimSoNguyenTo {
	public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);

        System.out.println("Nhập 1 số: ");
        int n = bienNhap.nextInt();
        boolean ok = true;

        for(int i = 2;i < n - 1;i++){
            if(n % i == 0){
                ok = false;
                break;
            }
        }
        
        if(ok == true)
            System.out.println(n + " là số nguyên tố !");
        else System.out.println(n + " không phải số nguyên tố !");    
        bienNhap.close();
    }
}
