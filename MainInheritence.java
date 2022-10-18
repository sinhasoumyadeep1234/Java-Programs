// Java program to implement the concept of single inheritence//

class Room{
	int length,breadth;
	Room(int x,int y){			//using constructor to initialize values//
		length=x;
		breadth=y;
	}
	int area(){
		return(length*breadth);
	}
}
class BedRoom extends Room{		 //using extend keyword to apply inheritence//
	int height;
	BedRoom(int x,int y,int z){		//using constructor to initialize values//
		super(x,y);				     //using super keyword to pass values to super class//
		height=z;	
	}
	int volume(){
		return(length*breadth*height);
	}
}
class MainInheritence{
	public static void main(String args[]){
		BedRoom b1=new BedRoom(4,2,10);
		int area1=b1.area();
		int volume1=b1.volume();
		System.out.println("Area of the room is "+area1);
		System.out.println("Volume of the Bedroom is "+volume1);	
	}
}