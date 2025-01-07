package com.abstraction;

public class testshape {

	public static void main(String[] args) {
		
		shapeoperation so=new shapeoperation();
		circle c1=new circle();
		so.triggerAllmethods(c1);
		
		rectangle r1=new rectangle();
		so.triggerAllmethods(r1);
		
		square s1=new square();
		so.triggerAllmethods(s1);

	}

}

