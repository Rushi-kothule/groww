package polymorphism;

public class One {
	public  void load () {
		System.out.println("method 1 load running");
	}
	public void load (int a,int b) {
		int c=a+b;
		System.out.println("load reuslt"+c);
	}
	public void load (int m, float b) {
		float r=m+b;
		System.out.println("load222 result"+r);
	}
	public void load (double e,double y) {
		double z=e*y;
		System.out.println("double result"+z);
	}
	public void load (char u,String y) {
	   String r=u+y;
	   System.out.println("char string "+r);
	   }
	public static void main(String[] args) {
		One ref = new One();
		ref.load ();
		ref.load(45,45.67f);
		ref.load(45,45);
		ref.load(56.567d,78.7897d);
		ref.load('r',"roane");
	}

}
