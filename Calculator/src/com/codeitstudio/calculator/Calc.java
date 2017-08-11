package com.codeitstudio.calculator;
//program on interfaces, anonymous class and lambda expressions.
//Lambda expressions is a new feature that has been introduced in Java SE 8.
//Lambda expressions are the substitute for the anonymous inner class.
//
interface drawable
{
	public void draw();
}

public class Calc {

	public static void main(String [] args)
{
	//This program is for anonymous inner class.
 drawable d = new drawable() {

	@Override
	public void draw() {
		//this is a anonymous inner class. We are defining the method here.
		int height = 10;
		int length = 20;
		int area = height*length;
		
		System.out.println("The area of the drawing page is:"+area);
	}
	 
 };	
 ///calling the method draw();
 d.draw();
 
}
	
}
