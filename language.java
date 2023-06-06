package sample;

public class language implements pro{

	public void langname() {
		System.out.print("JAVA");	
	}
	public void basepro() {
		System.out.println ("\nBase language: c,c++");
	}
	public void author() {
		System.out.print("Author:JAMES GOSLING");	
	}
	public static void main(String[] args) {
		language obj=new language();
		obj.langname();
		obj.basepro();
		obj.author();
	}	
}
