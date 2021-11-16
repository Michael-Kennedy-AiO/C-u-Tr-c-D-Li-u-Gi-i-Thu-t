package com.tiendd2008110316.tuan9.baitapthem;

public class Apple {
	
	public int id;
	public float KL;
	public String color;
	public Apple next;
	
	public Apple() {
		
	}
	
	public Apple(int _id, float _KL, String _color) {
		id = _id;
		KL = _KL;
		color = _color;
		next = null;
		//pre = null;
	}
	
	public void inTT() {
		System.out.println("Táo ID: "+ id + ", Khối Lượng: "+KL + ", Màu: "+color);
	}
}
