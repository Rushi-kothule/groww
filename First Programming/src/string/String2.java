package string;

public class String2 {
	public static void main(String[] args) {
		String ss = "This is java program";
		System.out.println(ss.length());

		for (int a = 3; a >= 0; a--) {
			System.out.print(ss.charAt(a));
		}
		System.out.print(" ");
		for (int b = 6; b >= 5; b--) {
			System.out.print(ss.charAt(b));
		}
		System.out.print(" ");
		for (int c = 11; c >= 8; c--) {
			System.out.print(ss.charAt(c));
		}
		System.out.print(" ");
		for (int d = 19; d >= 13; d--) {
			System.out.print(ss.charAt(d));
		}
	}

}
