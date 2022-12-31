package javaBasic;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Instant {

	public static void main(String[] args) {
		java.time.Instant timestamp = null;
		
		LocalDateTime ldt = LocalDateTime.ofInstant(timestamp, ZoneId.systemDefault());
		System.out.printf("%s %d %d at %d:%d%n", ldt.getMonth(), ldt.getDayOfMonth(),
		                  ldt.getYear(), ldt.getHour(), ldt.getMinute());

	}

}
