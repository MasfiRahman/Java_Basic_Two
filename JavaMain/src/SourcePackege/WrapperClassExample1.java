package SourcePackege;

public class WrapperClassExample1 {

	public static void main(String[] args) {
		
		
		int x = 30;
		Integer y = Integer.valueOf(x);//primitive to object elements
		System.out.println("y = "+y);
		
		
		Integer z = x;//Integer.valueOf(x)[AUTOBOXING ELEMENTS]
		System.out.println("z = "+z);
		
       Double d = new Double(18.2);
       System.out.println("d = "+d);
       
       double e = d.doubleValue();//object to primitive elements
       System.out.println("e = "+e);
       
       double f = d;//d.doubleValue()[UNBOXING ELEMNTS]
       System.out.println("f = "+f);
	}

}
