package com.tiendd2008110316.tuan8.kiemtragiuaky;


public class AppleNode {
	
	public int id;
	public float KL;
	public String color;
	public AppleNode next;
	
	public AppleNode() {
		
	}
	
	public AppleNode(int _id, float _KL, String _color) {
		id = _id;
		KL = _KL;
		color = _color;
	}
	
	public void inTT() {
		System.out.println("Táo ID: "+ id + ", Khối Lượng: "+KL + ", Màu: "+color);
	}
}
