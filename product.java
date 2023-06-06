package sample;

public class product {

	private int id,qty;
	private String name;
	private double price,totalprice;
	product(int id,String name,int qty,double price,double totalprice)
	{
		this.id=id;
		this.name=name;
		this.qty=qty;
		this.price=price;
		this.totalprice=totalprice;
	}
	public static void displayheadingformat()
	{
		System.out.format("\n%9s\t\t%9s\t\t%9s\t\t%9s\t\t%9s\t\t\n", "Product ID","Product Name","Quantity","Price","Total Price");
	}
	public void displayformat()
	{
		System.out.format("\n%-9s\t\t %-9s\t\t %-9s\t\t %9.2f\t\t %9.2f\n" ,id, name, qty, price, totalprice);
	}

}
	

	




