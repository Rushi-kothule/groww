package question;

import java.util.Scanner;

public class PalindromeN {
public static void main(String[] args) {
	
    Scanner rr = new Scanner(System.in);
	int a = rr.nextInt();
  
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
