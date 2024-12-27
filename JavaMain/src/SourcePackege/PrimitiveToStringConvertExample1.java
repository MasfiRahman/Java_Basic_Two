package SourcePackege;

public class PrimitiveToStringConvertExample1 {

	public static void main(String[] args) {
		
		
		int i = 100;
		String s = Integer.toString(i);//primitive to String
		System.out.println("s = "+s);
		
        
		double d= 100.25;
		String s2 = Double.toString(d);//primitive to String
		System.out.println("s2 = "+s2);
		
		boolean b = true;
		String s3 = Boolean.toString(true);//primitive to String
		System.out.println("s3 = "+s3);
	}

}
