package com.codeitstudio.calculator;
import java.util.*;
//program on interfaces, anonymous class and lambda expressions.
//Lambda expressions is a new feature that has been introduced in Java SE 8.
//Lambda expressions are the substitute for the anonymous inner class.
//
interface Calculate
{
	public int calculate(int i, int j);
}

public class Calc {

	public static void main(String [] args)
{
	//This program is for anonymous inner class.
 Calculate c = new Calculate() {

	@Override
	public int calculate(int i,int j) {
		int num1 = i;
		int num2 = j;
		//this is a anonymous inner class. We are defining the method here.
		return num1*num2;
	}

	
	 
 };	
 ///calling the method calculate;
 c.calculate(2,7);
 
}
	
}
