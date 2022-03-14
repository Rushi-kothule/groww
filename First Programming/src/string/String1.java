package string;

public class String1 {
	public static void main(String[] args) {
		String ss= "velocity";
		String tt= "qweraatyuiopaasdfaaghj";
		String [] str=tt.split("aa");
		
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		System.out.println(ss.concat(tt));
		System.out.println(tt.replace("aa", "NN"));
	}

}
