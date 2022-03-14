package question;

public class CharCount {
	public static void main(String[] args) {
		String w = "this is oops concept";
		int a = w.length();
		int b = w.replace("i", "").length();
		int c = a - b;
		System.out.println("charcount_____" + c);
	}

}
