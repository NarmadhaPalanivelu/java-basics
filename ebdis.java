package sample;
import java.util.*;
public class ebdis extends ebcal {
	
	public void display() {
		System.out.println("home name:-------"+hname);
		System.out.println("home no:------"+hno);
		System.out.println("bill amount----"+bill);
		
	}

	public static void main(String[] args) {
		ebdis elec=new ebdis();
		elec.get();
		elec.cal();
		elec.display();

	}

}

