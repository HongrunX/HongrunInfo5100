package assignment5.Q2;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		
	}
public void count(){
	try
	{
		int a,b,c;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first number : ");
		a=input.nextInt();
		System.out.print("Enter second number : ");
		b=input.nextInt();
   		c=a/b;
		System.out.println("Result:"+c);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Error:"+e.getMessage());
		System.out.println("Error:"+e);
	}
	System.out.println("End of Program.");
}
}