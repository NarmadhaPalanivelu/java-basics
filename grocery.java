package sample;
import java.util.*;


public class grocery {
	int total=0,cream,milk,veg,chicken;
	String sname;
	Scanner in=new Scanner(System.in);
	
	public void get() {
		
		System.out.println("enter shop name:");
		sname=in.next();
		System.out.println("enter price of cream");
		cream=in.nextInt();
		System.out.println("enter price of milk");
		milk=in.nextInt();
		System.out.println("enter price of veg");
		veg=in.nextInt();
		System.out.println("enter price of chicken");
		chicken=in.nextInt();
		
		
	}
    public void cal() {
    	total=cream+milk+veg+chicken;
    }
    public void display() {
    	System.out.println("cream---------"+cream);
    	System.out.println("milk---------"+milk);
    	System.out.println("vegetable---------"+veg);
    	System.out.println("chicken---------"+chicken); 
    	System.out.println("total---------"+total);
    }
	public static void main(String[] args) {
		grocery g=new grocery();
		g.get();
		g.cal();
		g.display();

	}

}
