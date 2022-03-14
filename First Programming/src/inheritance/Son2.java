package inheritance;

public class Son2 extends Father {
	
	
	public void SportBike() {
		System.out.println("Son-2 property Sport bike");
	}
	
	public void Apple() {
		
		System.out.println("Son--2 Property apple");
	}
	
	
	public static void main(String[] args) {
		Son2 rr= new Son2();
		rr.Apple();
		rr.SportBike();rr.car();rr.house();
		
	}

}
