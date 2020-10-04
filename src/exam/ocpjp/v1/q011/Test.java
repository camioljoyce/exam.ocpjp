package exam.ocpjp.v1.q011;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Test {

	public static void main(String[] args) {
		ZonedDateTime depart = ZonedDateTime.of(2015,1,15,3,0,0,0, ZoneId.of("UTC-7"));
		ZonedDateTime arrive = ZonedDateTime.of(2015,1,15,9,0,0,0, ZoneId.of("UTC-5"));
		
		//arrive-depart = 時間相減 - 時區相減
		// (9-3) - (-5-(-7)) = (6) - (2) = 4
		long hrs = ChronoUnit.HOURS.between(depart, arrive);
		System.out.println("Travel Time is "+hrs+" hours");
		
		ZonedDateTime depart2 = ZonedDateTime.of(2015,1,15,3,0,0,0, ZoneId.of("UTC-8"));
		ZonedDateTime arrive2 = ZonedDateTime.of(2015,1,15,2,0,0,0, ZoneId.of("UTC+5"));
		//arrive-depart = 時間相減 - 時區相減
		// (2-3) - (5-(-8)) = (-1) - (13) = -14
		long hrs2 = ChronoUnit.HOURS.between(depart2, arrive2);
		System.out.println("Travel Time2 is "+hrs2+" hours");
	}	

}
