package com.tiendd2008110316.tuan8.kiemtragiuaky;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppleStore {

	public List<Apple> appleStore;
	
	public AppleStore() {
		appleStore = new ArrayList<Apple>();
	}
	
	public void addApple() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập khối lượng táo: ");
		float KL = input.nextFloat();
		
		System.out.print("Nhập màu táo: ");
		input.nextLine();
		String color = input.nextLine();
		
		appleStore.add(new Apple(appleStore.size(), KL, color));
		System.out.println("--------------------------------");
		System.out.println();
	}
	
	public void inListApple() {
		for (Apple apple : appleStore) {
			apple.inTT();
		}
		System.out.println("--------------------------------");
		System.out.println();
	}
	
	public void FindAppleWithColor(String color) {
		
		int count = 0;
		
		for (Apple apple : appleStore) {
			if (apple.color.equalsIgnoreCase(color)) {
				count++;
				apple.inTT();
			}
		}
		if (count == 0) {
			System.out.println("Không có trái táo nào màu "+ color);
		}
		System.out.println("--------------------------------");
		System.out.println();
	}
}
