//Program to implement the concept of constructor//

import java.lang.*;
import java.util.*;

class Rectangle{
	int length,breadth;
	Rectangle(int x,int y){
		length=x;
		breadth=y;
	}
	int rectArea(){
		return(length*breadth);
	
	}
}
class MainRect2{
	public static void main(String args[]){
	Rectangle r1=new Rectangle(10,20);
	int area1=r1.rectArea();
	System.out.println("Area is:"+area1);
	
	}
}