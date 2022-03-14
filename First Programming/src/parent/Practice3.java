package parent;

public class Practice3 extends  Practice2 {
	public void june() {
		System.out.println("incomplete method complete");
	}

	public static void main(String[] args) {
		Practice3 rr= new Practice3();
		rr.may();
		rr.june();
	}
}
