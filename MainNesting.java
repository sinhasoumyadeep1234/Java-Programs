//Java program to implement the concept of nesting of methods//

import java.lang.*;

class Nesting{
int x,y;
	Nesting(int a,int b){			//constructor//
	x=a;
	y=b;
	}
	int largest(){
		if(x>=y){
			return(x);
		}
		else
			return(y);
	}
	void display(){
		int large=largest();		//calling method largest() inside another method display() thus nesting of methods//
		System.out.println("The largest among " +x+ " & " +y+ " is " +large);
	}
}
class MainNesting{
	public static void main(String args[]){
		Nesting n1=new Nesting(50,100);
		n1.display();
	}
}