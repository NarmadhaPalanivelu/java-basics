
package sample;
import java.util.*;
public class lexception {

	public static void main(String[] args) {
		int option;
		Scanner in=new Scanner(System.in);
		System.out.print("enter your choice");
		option=in.nextInt();
		switch(option)
		{
		case 1:
		{
			int x;
			try {
				x=10/0;
				System.out.println(x);	
			}
			catch(ArithmeticException e)
			{
			e.printStackTrace();	
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();		
			}
			catch(Exception e)
			{
				e.printStackTrace();
		    }
			break;
		}
		case 2:
		{
			int a[]= {1,2,3,4,5};

		try {
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();		
		}
		catch(ArithmeticException e)
		{
		e.printStackTrace();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		
	    }
		break;
		}
		case 3:
		{
			int age=18;
			try 
			{
				if(age>18)
				{
				 throw new CustomException("eligible to vote");
				}
				else
				{
					System.out.println("no vote");
				}
			}
			catch(CustomException e) {
				e.printStackTrace();
			}
			break;
		}	
		}
	}
}
