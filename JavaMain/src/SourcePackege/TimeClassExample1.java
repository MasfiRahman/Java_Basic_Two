package SourcePackege;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeClassExample1 {

	public static void main(String[] args) {
		
		//non formatting time
		LocalTime time =  LocalTime.now();
		System.out.println(time);
        
		//formatting time
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
		String formattedtime = time.format(formatter);
		System.out.println(formattedtime);
		
	}

}
