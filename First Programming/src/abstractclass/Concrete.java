package abstractclass;

public class Concrete extends Test{
	
	
	public void m2() {
		
		System.out.println("Incomplete method complete in this class");
	}
	
	public static void main(String[] args) {
		Concrete rr=new Concrete();
		rr.m1();
		rr.m2();
	}

}
