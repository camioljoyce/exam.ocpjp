package exam.ocpjp.v1.q082;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

interface CourseFilter extends Predicate<String> {
	public default boolean test (String str) {
		return str.equals ("Java");
	}
}
public class Test {
	public static void main(String[] args) {
		List<String> strs = Arrays.asList("Java", "Java EE", "Java ME");
		Predicate<String> cf1 = s -> s.length()>3;
		Predicate<String> cf2 = new CourseFilter(){ //line n1
			public boolean test (String s) {
				return s.contains ("Java");
			}
		};
		
		long c = strs.stream().filter(cf1).filter(cf2).count();
		System.out.println(c);
	}
}
