package returntype;

public class Demo1 {
public  String srk()
{
	String p1=("java");
	String p2=("programming");
	String p3=(p1+p2);
	return p3;
	}

public static void main(String[] args) {
	Demo1 ref= new Demo1();
	System.out.println(ref.srk());
}
}
