// Java program to implement the concept of static members//

import java.lang.*;

class MathOperations{

	static double mul(double x,double y){
		return(x*y);
	}
	static double div(double a,double b){
		return(a/b);
	}
}
class MainOperation{
	public static void main(String args[]){
		double mul1=MathOperations.mul(4.0,5.0);		// static members does not require creation of any object instance variable..they can be directly accessed from the respective class..hence they are called class variables or class methods//
		double div1= MathOperations.div(6.0,2.0);
		System.out.println("Multiplication value = "+mul1);
		System.out.println("Division value = "+div1);
	}
}
		