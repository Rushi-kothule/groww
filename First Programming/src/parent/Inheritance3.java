package parent;

public class Inheritance3 extends Inheritance2{
 
	public void Son3 () {
		System.out.println("Son3 property Watch");
	}
	
	public static void main(String[] args) {
		Inheritance3 ref= new Inheritance3();
		ref.Son3();
		ref.son2();
		ref.bike();
		ref.gold();
		ref.land();
	}
}
