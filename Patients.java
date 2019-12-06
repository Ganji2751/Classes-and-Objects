import java.util.*;
import java.lang.*;

class Patient
{
	String name;
	double weight,height;
	public double bMI(double height,double weight)
	{
		double bmi = (weight/(height*height))*703; 
		return bmi;
	}
}
class Patients
{
	public static void main(String args[])
	{
		Patient obj = new Patient();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		obj.name=sc.next();
		System.out.println("Hai,"+obj.name+"enter your height and weight");
		obj.height=sc.nextDouble();
		obj.weight=sc.nextDouble();
		System.out.println(obj.name+" your BMI is : "+obj.bMI(obj.height,obj.weight));
		
	}
}