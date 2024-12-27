package SourcePackege;

public class StringBufferClassExample1 {

	public static void main(String[] args) {
		
		
		StringBuffer sb = new StringBuffer("Masfi");
		System.out.println(sb);
		
		//append elements
		sb.append(" Rahman ");
		sb.append(82);
		System.out.println(sb);
		
		//reverse method
		sb.reverse();
		System.out.println(sb);
        
		
		//delete elements
		sb.delete(0, 5);
		System.out.println(sb);
		
		
		//length elements
		sb.setLength(5);
		System.out.println(sb);
	}

}
