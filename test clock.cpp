#include <stdio.h>
#include <windows.h>
int main(){
	
	int h,m,s;
	int d=1000;        //setting delay of 1000 ms
	printf("Set your time (hour..min..sec):\n");
	scanf("%d%d%d",&h,&m,&s);
	if(h>12 || m>60 || s>60){
		printf("Error !! \n");
		exit(0);
	}
	while(1){         //creating an infinite loop
		s++;
		if(s>59){
			m++;
			s=0;
		}
		if(m>59){
			h++;
			m=0;
		}
		if(h>12){
			h=1;
		}
		printf("\n Your real Clock: ");
		printf("\n %02d:%02d:%02d",h,m,s);     //this prints our time in 00:00:00 format
		Sleep(d);  //this slows the infinite while loop
		system("cls"); // clears the screen
    }
}