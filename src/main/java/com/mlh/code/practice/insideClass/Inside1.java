package com.mlh.code.practice.insideClass;


public class Inside1 {
	class Contents{
		private int i =1;
		public int value(){
			return i;
		}
	}
	
	class Destination{
		private String string = "a";
		public String label(){
			return string;
		}
	}
	
	public void ship(String desc){
		Contents c = new Contents();
		Destination d = new Destination();
		System.out.println(c.value());
		System.out.println(d.label());
	}
	
	public static void main(String[] args) {
		Inside1 in = new Inside1();
		in.ship("a");
	}
}
