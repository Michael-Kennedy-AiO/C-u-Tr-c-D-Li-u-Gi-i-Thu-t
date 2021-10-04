package com.tiendd2008110316.tuan2.lab2;

import java.util.Scanner;

public class PTB2 {
	public static void main(String[] args) {
        Scanner nhapBien = new Scanner(System.in);

        System.out.println("Nhập a,b,c: ");
        double a = nhapBien.nextDouble();
        double b = nhapBien.nextDouble();
        double c = nhapBien.nextDouble();

        double delta = Math.pow(b,2)-4*a/c;
        System.out.println("Tính delta: "+delta);

        if(a == 0){
            if(b == 0){
                if(c == 0) System.out.println("Phương trình vô số nghiệm!");
                else System.out.println("Phương trình vô nghiệm!");
            }
            else System.out.println("Phương trình có nghiệm là: " + -c/b);
        }
        else if(delta == 0) System.out.println("Phương trình có nghiệp kép x1 = x2 = " + -b/2*a);
        else if(delta >= 0)  System.out.printf("x1 = %.2f \nx2 = %.2f", (-b + Math.sqrt(delta))/2*a, (-b - Math.sqrt(delta))/2*a);
        else System.out.println("Phương trình vô nghiệm!");
        nhapBien.close();
    }
}
