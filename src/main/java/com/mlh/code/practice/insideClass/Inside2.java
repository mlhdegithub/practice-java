package com.mlh.code.practice.insideClass;

import java.awt.print.Printable;

public class Inside2 {

	class Contents {
		private int i = 12;
		public int value (){return i;}
	}
	
	class Destination{
		private String string  = "s";
		Destination(String whereTo) {
			string = whereTo;
		}
		String readLabel(){
			return string;
		}
	}
	
	public Destination to(String s){
		return new Destination(s);
	}
	
	public Contents contents(){
		return new Contents();
	}
	
	
	public void ship(){
		Contents c = contents();
//		Deprecated d = new Destination("12");
		Destination destination = to("12");
		
		System.out.println(destination.readLabel());
	}
}
