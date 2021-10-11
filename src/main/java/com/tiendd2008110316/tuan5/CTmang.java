package com.tiendd2008110316.tuan5;

public class CTmang {
    public static void main(String[] args) {
        
        int []array = {3,5,7,9}; //n=4

        int addElement = 8; //Phần tử cần thêm vào

        int n = array.length;

        int []newArr = new int[n+1];

        for(int i = 0; i < n; i++){
            newArr[i] = array[i];
        }
        
        System.out.println("In mảng cũ: ");
        for(int x: array){
            System.out.println(x);
        }

        newArr[n] = addElement;
        System.out.println("In mảng mới: ");
        for(int x: newArr){
            System.out.println(x);
        }
    }
}
