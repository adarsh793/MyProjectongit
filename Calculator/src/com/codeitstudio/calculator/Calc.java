package com.codeitstudio.calculator;
import java.util.*;
//program on interfaces, anonymous class and lambda expressions.
//Lambda expressions is a new feature that has been introduced in Java SE 8.
//Lambda expressions are the substitute for the anonymous inner class.
//
interface Calculate
{
	public static int calculate(int i, int j);
}

public class Calc {

	public static void main(String [] args)
{
	//This program is for anonymous inner class.
 Calculate c = new Calculate() {

	@Override
	public void calculate() {
		int num1 = i;
		int num2 = j;
		//this is a anonymous inner class. We are defining the method here.
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of Num1");
		num1 = sc.nextInt();
		System.out.println("Enter the value of Num2");
		num2 =sc.nextInt();
		return num1*num2;
	}
	 
 };	
 ///calling the method draw();
 c.calculate();
 
}
	
}
