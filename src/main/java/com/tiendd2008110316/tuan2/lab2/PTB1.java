package com.tiendd2008110316.tuan2.lab2;

import java.util.Scanner;

public class PTB1 {
	public static void main(String[] args) {
        Scanner nhapBien = new Scanner(System.in);

        int a = nhapBien.nextInt();
        int b = nhapBien.nextInt();

        if(a == 0){
            if(b == 0){
                System.out.println("PT vô số nghiệm");
            }
            else{
                System.out.println("PT vô nghiệm");
            }
        }
        else{
            System.out.printf("Tính và xuất nghiệm x = %d ", -b/a);
        }   
    }
}
