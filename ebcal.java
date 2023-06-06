package sample;
import java.util.*;
public class ebcal extends ebhome {
	int unit=280;
			double bill=0;
			
	
	
	
	public void cal() {
		if(unit<100) {
			bill=unit*1.20;
		}
		else if(unit<=300) {
			bill=100*1.20+(unit-100)*2;
		}
		else if(unit>300) {
			bill=100*1.20+200*2+(unit-300)*3;
		}
		
		System.out.println("enter unit amount:");
		unit=in.nextInt();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
