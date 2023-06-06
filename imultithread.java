package sample;

public class imultithread implements Runnable {
	public void run() {
		int i;
		for(i=0;i<3;i++) 
		{
			System.out.println("the name of thread is "+Thread.currentThread().getName()+"value is"+i);
		}
	}

	public static void main(String[] args) {
		imultithread interfaceobj1=new imultithread();
		Thread threadobj1=new Thread(interfaceobj1);
		imultithread interfaceobj2=new imultithread();
		Thread threadobj2=new Thread(interfaceobj2);
		imultithread interfaceobj3=new imultithread();
		Thread threadobj3=new Thread(interfaceobj3);
		threadobj1.start();
		threadobj2.start();
		threadobj3.start();
		//threadobj1.setName("narmadha");
		//threadobj2.setName("tony");
		//threadobj3.setName("shalu");

	}

}
