package sample;

public class grandchild extends child{
	public grandchild() {
		System.out.println("AUDI A6");
	}
	public void year1() {
		System.out.println("audio a6:2012");
	}

	public static void main(String[] args) {
		grandchild g3=new grandchild();
		g3.vehicletype();
		g3.speed();
		g3.year();
		g3.year1();

		
		
	}

}
