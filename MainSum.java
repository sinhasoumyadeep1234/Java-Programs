//Java program to implement the concept of method overloading//

import java.lang.*;
import java.util.*;

class Sum{
	int sum(int a,int b){
		
		return(a+b);
	}
	int sum(int x,int y,int z){
		
		return(x+y+z);
	}
	double sum(double c,double d){
		
      		return(c+d);
	}
	double sum(double s, double t,double u){
		
		return(s+t+u);
	}
}

class MainSum{
	public static void main(String args[]){
		int a,b,x,y,z;
		double c,d,s,t,u;
		Sum s1=new Sum();
		Sum s2=new Sum();
		Sum s3=new Sum();
		Sum s4=new Sum();
		int sum1=s1.sum(1,2,3);
		System.out.println("Sum of 3 int="+sum1);
		int sum2=s2.sum(2,3);
		System.out.println("Sum of 2 int="+sum2);
		double sum3=s3.sum(2.0,3.0);
		System.out.println("Sum of 3 doubles ="+sum3);
		double sum4=s4.sum(2.0,4.0,4.0);
		System.out.println("Sum of 3 doubles="+sum4);
	}
}
		