package com.tiendd2008110316.tuan2.lab2;

import java.util.Scanner;

public class TinhPTB1_PTB2_Tiendien {
	public static void main(String[] args) {
        System.out.println("+--------------------------------+");
        System.out.println("1.	Giải phương trình bậc nhất");
        System.out.println("2.	Giải phương trình bậc 2");
        System.out.println("3.	Tính tiền điện");
        System.out.println("4.	Kết thúc");
        System.out.println("+--------------------------------+");
        System.out.println("Chọn chức năng:");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        switch(key){
            case 1 : 
                giaiPTbac1();
                break;
            case 2 : 
                giaiPTbac2();
                break;
            case 3 : 
                tinhtiendien();
                break;
            case 4 : 
            System.out.println("Kết thúc !");
            System.exit(0);
        }
        sc.close();
    }
    static void giaiPTbac1(){
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

    static void giaiPTbac2(){
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

    static void tinhtiendien(){
        Scanner bienNhap = new Scanner(System.in);
        System.out.println("Nhập số điện sử dụng: ");
        double sodiensudung = bienNhap.nextDouble();

        if(sodiensudung < 50)
            System.out.printf("Tiền điện: %.2f", sodiensudung*1000);
        else
            System.out.printf("Tiền điện: %.2f", sodiensudung*1200);
        
    }
}
