/*Program to  use the concept of constructor*/

import java.lang.*;
import java.util.*;

class Box{
	int l;
	int w;
	int h;
	public void setval(int a,int b,int c){
		l=a;
		w=b;
		h=c;
	}
	public void getval(int a,int b,int c){
		System.out.println("The value of l = "+a+ "w= "+b+ "h= "+c);
	}
}
class Mainbox{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Box b1=new Box();
	System.out.println("Enter the values of length,breadth and height:");
	int len=sc.nextInt();
	int brd=sc.nextInt();
	int hig=sc.nextInt();
	b1.setval(len,brd,hig);
	b1.getval(len,brd,hig);
	}
}