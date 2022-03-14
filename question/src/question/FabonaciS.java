package question;

public class FabonaciS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=1;
		int c;
		for (int i=1,e=1;i<=20;i++) {
			
			c=a+b;
			System.out.println(e+" "+c);
			a=b;                                 
			b=c;
			e++;
		}
	}
}
