package SourcePackege;

public class StringExample5 {

	public static void main(String[] args) {
		
		
		String s1 = "This is my country";
		System.out.println(s1);
		//replace elements
		String s2 = s1.replace('i', 'j');
		System.out.println(s2);
		
		//split elements
		String[] s3 = s1.split(" ");
		for(String x : s3) {
			System.out.println(x);
		}
		

	}

}
