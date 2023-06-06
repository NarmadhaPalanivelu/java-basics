package sample;
import java.util.*;
public class bill {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int id,qty;
		char choice;
		String name;
		double price,totalprice=0.0,overallprice=0.0;
		ArrayList<product> arrlist=new ArrayList<product>();
		do
		{
			System.out.print("Enter the id :");
			id=obj.nextInt();
			System.out.print("Enter the name :");
			name=obj.next();
			System.out.print("Enter the quantity :");
			qty=obj.nextInt();
			System.out.print("Enter the price :");
			price=obj.nextDouble();
			totalprice=price*qty;
			overallprice+=totalprice;
			arrlist.add(new product(id,name,qty,price,totalprice));
			System.out.print("Do you want continue Y or N");
			choice=obj.next().charAt(0);
		}while(choice=='y'||choice=='Y');
		product.displayheadingformat();
		for(product p:arrlist)
		{
			p.displayformat();
		}
		System.out.println("\n\t\t\t\t\t\t\t\t\tOverall Price                "+overallprice);
	}

}



