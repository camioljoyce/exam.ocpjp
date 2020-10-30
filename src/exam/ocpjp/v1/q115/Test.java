package exam.ocpjp.v1.q115;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		List<String> colors = Arrays.asList("red", "green", "yellow");
		
		Predicate<String> test = n -> {
			System.out.println("Searching...");
			return n.contains("red");
		};
		colors.stream()
		.filter(c -> c.length() > 3)
		.allMatch(test);
	}

}
