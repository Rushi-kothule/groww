package returntype;

public class Demo {

	
	public float test(float a,float b)     // non static method
	{
		
		float result= a+b;
		return result;
		}
	
	public static void main (String[] args) {
		
		Demo ref =new Demo();
		System.out.println(ref.test(100.50f,200.57f));
		System.out.println(ref.test(5.852f,9.50f));
		
	
		
	}
}
