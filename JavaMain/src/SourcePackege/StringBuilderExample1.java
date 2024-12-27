package SourcePackege;

public class StringBuilderExample1 {

	public static void main(String[] args) {
		
		
		StringBuilder str = new StringBuilder("Masfi");
		System.out.println("STR = "+str);
		
		//append elements
		str.append(" Rahman");
		str.append(" 82");
		str.append(" 18.2");
		System.out.println("Str : "+str);
        
		
		//reverse elements
		str.reverse();
		System.out.println("Str : "+str);
		
		//delete elements
		str.delete(2, 5);
		System.out.println(str);
	}

}
