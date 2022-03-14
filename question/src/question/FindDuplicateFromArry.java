package question;

import java.util.HashSet;

public class FindDuplicateFromArry {
	
	public static void main(String[] args) {
		int[] a= {1,2,6,7,6,5,9,7,7,6};
		
		HashSet<Integer>  hash =new HashSet<Integer>();
		
		for (int b=0;b<=a.length-1;b++) {
			
			if (hash.add(a[b])==false) {
				System.out.println(a[b]+"is duplicate in arry");
			}
		}
	}

}
