package inheritance;

public class Son1 extends Father{
	
	public void bike() {
		
		System.out.println("Sons--1 property bike");
		
	}
	
    public void mobail() {
    	
    	System.out.println("sons--1 property mobail");
    }
	
	public static void main(String[] args) {
		Son1 rr= new Son1();
		rr.car();rr.house();rr.mobail();rr.bike();
	}
	
	}

