
package sample;
import java.util.*;

public class student {
	String name,dept;
	int id,total=0,average=0,i;
	int marks[]=new int[5];
    Scanner in=new Scanner(System.in);
    
    void get() {
    	System.out.print("enter name:");
    	name=in.next();
    	System.out.print("enter id:");
        id=in.nextInt();
    	
    	System.out.print("enter department:");
    	dept=in.next();
    	
    	System.out.print("enter the marks:");
    	for(i=0;i<5;i++) {
    		marks[i]=in.nextInt(); 
    	}
    }
void cal() {
	for(i=0;i<5;i++) {
	total=total+marks[i];
	}
	average=total/5;
}
void display() {
	System.out.println("NAME:"  +name);
	System.out.println("ID:"     +id);
	System.out.println("DEPARTMENT:"  +dept);
	System.out.println("MARKS:");
	for(i=0;i<5;i++) {
		System.out.println(marks[i]);
		}
	System.out.println("TOTAL:" +total);
	System.out.print("AVERAGE:"  +average);

}
	public static void main(String[] args) {
		
		student obj=new student();
		obj.get();
		obj.cal();
		obj.display();

	}

}
