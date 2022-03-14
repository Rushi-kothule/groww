package question;

public class Eachwordlength {
	public static void main(String[] args) {
		
	
	String w ="this is java program";
	String[] rr = w.split(" ");
	
	
           for(int a=0 ; a<=w.length()-1;a++) {
           System.out.println(rr[a].length());
	}
           }
}
