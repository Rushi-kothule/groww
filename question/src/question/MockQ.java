package question;

public class MockQ {

	public static void main(String[] args) {
		for (int a = 0; a <= 5; a++) {
			for (int b = 0; b <= a; b++) {
				System.out.print(" ");
			}
            for (int b = 4, v = 2; b >= a; b--) {

				System.out.print(v + "*");
				v++;
        	}
			System.out.println();
		}
	}
}
