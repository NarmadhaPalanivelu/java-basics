
package sample;

public class cmultithread extends Thread {
	public void run() {
		int i;
		for(i=0;i<3;i++) 
		{
			System.out.println("the name of thread is "+Thread.currentThread().getName()+"value is"+i);
		}
	}

	public static void main(String[] args) {
		cmultithread threadobj1=new cmultithread();
		cmultithread threadobj2=new cmultithread();
		cmultithread threadobj3=new cmultithread();
		threadobj1.start();
		threadobj2.start();
		threadobj3.start();
	
		
		
	}

}
