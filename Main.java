import java.util.*;
import java.io.*;
import java.lang.*;

class Calculator
{
	static double powerInt(int num1,int num2)
	{
		return Math.pow(num1,num2);
	}
	static double powerDouble(double num1,int num2)
	{
		return Math.pow(num1,num2);
	}
}
class Main
{
	public static void main(String args[])
	{
		System.out.println(Calculator.powerInt(2,3));
		System.out.println(Calculator.powerInt(3,2));
	}
}