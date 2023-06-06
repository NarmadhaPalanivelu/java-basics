package sample;
import java.util.*;

public class constructor {
	
	constructor(){
		System.out.print("volume of box");
	}
	constructor(int x,int y,int z)
	{
		System.out.println("volume of the box=" +x*y*z);
	}
	constructor(String name1, String name2){
		System.out.println("Myself "+name1+" loves"+name2);
		
		
	}
	public static void main(String[] args) {
		
		int a=2,b=3,c=6,ht,br,len;
		String name1="narmadha";
		String name2="britto";
		Scanner in=new Scanner(System.in);
		constructor obj=new constructor(a,b,c);
		constructor obj1=new constructor(name1,name2);
		System.out.println("from user---------------");
		System.out.println("enter height:");
		ht=in.nextInt();
		System.out.println("enter breadth:");
		br=in.nextInt();
		System.out.println("enter length:");
		len=in.nextInt();
		System.out.print("volume="+ht*br*len);
		
		
				
		
				
		
		
	}
	

}
