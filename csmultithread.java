package sample;

public class csmultithread extends Thread
{
	String a[]= {"narmadha","tony","shalu","dexter"};	
	public void run()
	{
	int i;
	for(i=0;i<a.length;i++) {
		System.out.println("the value is:"+a[i]);
	}
	}

	public static void main(String[] args) {
		csmultithread threadobj1=new csmultithread();
		csmultithread threadobj2=new csmultithread();
		csmultithread threadobj3=new csmultithread();	
		threadobj1.start();
		threadobj2.start();
		threadobj3.start();
	}

}
