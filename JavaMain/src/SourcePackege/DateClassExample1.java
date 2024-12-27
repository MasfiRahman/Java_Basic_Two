package SourcePackege;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassExample1 {

	public static void main(String[] args) {
		
		//non formatting date elements
		Date date = new Date();
		System.out.println(date);
		
		//formatting date elements
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
		String currentdate = dateFormat.format(date);
		System.out.println("Current Date :"+currentdate);
		

	}

}
