import java.util.*;
import java.io.*;
import java.lang.*;

class Box
{
	double width,height,length;
	public void initial(double width,double length,double height)
	{
		this.width=width;
		this.length=length;
		this.height=height;
	}
	public double volume(double width,double length,double height)
	{
		return (height*length*width);
	}
	public static void main(String args[])
	{
		Box obj = new Box();
		obj.initial(2,3,4);
		System.out.println("The volume is of the box is : "+obj.volume(2,3,4));
	}
}