package exam.ocpjp.v1.q113;

import java.time.LocalDate;
import java.time.Month;

public class Test {

	public static void main(String[] args) {
		LocalDate valentinesDay =LocalDate.of(2015, Month.FEBRUARY, 14);
		LocalDate nextYear = valentinesDay.plusYears(1);
		nextYear.plusDays(15); //line n1
		System.out.println(nextYear);
//		What is the result?
//				A. 2016-02-14
//				B. A DateTimeException is thrown.
//				C. 2016-02-29
//				D. A compilation error occurs at line n1.
//				Answer: A

	}

}
