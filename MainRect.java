//Program to implement the concept of class and objects//

import java.lang.*;
import java.util.*;

class Rectangle{
	int length,breadth;
	void getdata(int x,int y){
		length=x;
		breadth=y;
	}
	void rectarea(){
	int area=length*breadth;
	System.out.println("The area of the rectangle with length=" +length+ " and breadth= " +breadth+ " is= " +(area));
	}
}
class MainRect{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Rectangle r1=new Rectangle();
	Rectangle r2=new Rectangle();
	r1.length=2;
	r1.breadth=3;
	int area1= r1.length*r1.breadth;
	System.out.println("Area is:"+ area1);
	System.out.println("Enter the new dimensions of the rectangle:");
	int c=sc.nextInt();
	int d=sc.nextInt();
	r2.getdata(c,d);
	r2.rectarea();
	}
}