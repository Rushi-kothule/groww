package firstprog;

public class MethodCall1 {

	// static method
	public static void test() {
		System.out.println("J");
		System.out.println("a");
		System.out.println("v");
		System.out.println("a");
	}

	// non static method
	public void sample() {

		System.out.println("programming");
	}

	// method call in main method
	public static void main(String[] args) {

		MethodCall1.test();
		MethodCall1 ref = new MethodCall1();
		ref.sample();

	}
}
