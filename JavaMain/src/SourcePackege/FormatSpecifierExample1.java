package SourcePackege;

public class FormatSpecifierExample1 {

	public static void main(String[] args) {
		
		boolean b= true;
        char c = 'a';
        short s = 32677;
        int i = 10;
        float f = 10.6f;
        double d = 9.2;
        System.out.printf("Boolean b = %b\n",b);
        System.out.printf("Character c = c\n",c);
        System.out.printf("Short s = %d\n",s);
        System.out.printf("Integer i = %d\n",i);
        System.out.printf("Floating f = %.3f\n",f);
        System.out.printf("Double d = %.3f\n",d);
		
	}

}
