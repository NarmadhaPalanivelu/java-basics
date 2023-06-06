

package sample;
import java.util.*;
public class collections {

	public static void main(String[] args) {
		int op;
		Scanner in=new Scanner(System.in);
		System.out.println("enter choice");
		op=in.nextInt();
		switch(op)
		{
		case 1:	
///////////////////array///////////////////////////////////////////////////
		{
			ArrayList<Integer> num=new ArrayList<Integer>();
			num.add(10);
			num.add(11);
			num.add(12);
			num.add(13);
			num.add(14);
			num.add(15);
			num.add(16);
			System.out.print("before removing" +num);
			Iterator<Integer>iteratorobj=num.iterator();
			while(iteratorobj.hasNext())
			{
				Integer arrayvalues=iteratorobj.next();
				if(arrayvalues%2==0) {
					iteratorobj.remove();
				}
			}
			System.out.println("after removing:" +num);
			break;
		}
		case 2:
		{
			LinkedList<String>str=new LinkedList<String>();

			str.add(0,"heloo");
			str.add(1,"hel0w");
			str.add(2,"hellllllllllllllo");
			str.add(3,"heloi");
			str.add(4,"hai");
			str.add(5,"hyyyy");
			
			
			System.out.println(str);
			str.set(5,"narmadha");
			System.out.println(str);
			break;
		}
		case 3:
		{
			SortedSet<Character>ch=new TreeSet<Character>();
			ch.add('A');
			ch.add('A');
			ch.add('b');
			ch.add('A');
			ch.add('A');
			ch.add('c');
			ch.add('A');
			ch.add('d');
			ch.add('e');
			System.out.println(ch);
			ch.remove('A');
			System.out.println(ch);
			break;
			
	}
		case 4:
		{
			Stack<String>ss=new Stack<String>();
			ss.push("narmadha");
			ss.push("loves");
			ss.push("britto");
			System.out.println(ss);
			ss.pop();
			System.out.println(ss);
			ss.push("lawrence");
			System.out.println(ss);
			break;
	
		}
			
}
}
}