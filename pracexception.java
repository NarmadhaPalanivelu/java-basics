package sample;
import java.util.*;

public class pracexception  extends Exception{

	public static void main(String[] args) {
		int option;
		Scanner in=new Scanner(System.in);
		System.out.println("enter your choice");
		option=in.nextInt();
		switch(option)
		{
		case 1:
		{
			System.out.println("multiple catch block");
			try {
				int a[]= new int[5];
				a[5]=30/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println("arithmetic expression occurs");
			}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}

	}
		case 2:
		{
			System.out.println("IndexOutOfBoundsException");
			try {
				int a[]= new int[5];
				System.out.println(a[10]);	
		}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutOfBounds Exception occurs");
			}
			break;

}
		case 3:
		{
			System.out.println("USERDEFINED EXCEPTION");
			try {
				System.out.println("Starting of try block");
				throw new pracexception();
			}
			catch(pracexception exp)
			{
				System.out.println("catch block");
				System.out.println(exp);
			}
		}
	}
}
}

