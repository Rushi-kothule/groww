package interface1;

public class Imp implements Interface22{
	
	
	public void m1() {
		System.out.println("complete method");
		
	}
	public void m2() {
		System.out.println("incomlrte method");
	}
	
	
  public static void main(String[] args) {
	Imp rr=new Imp();
	rr.m2();rr.m1();
}
}
