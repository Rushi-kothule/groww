package question;

public class Palindrome {
	public static void main(String[] args) {
		int a=191;
		int c=a;
		int r;
		int s=0;
		while (a!=0) {
			
			r=a%10;
			s=s*10+r;
			a=a/10;
			
		}
		if (c==s) {
			System.out.println("palindrome number");
		} else {
			System.out.println("not palindrome number");
		}
	}

}
