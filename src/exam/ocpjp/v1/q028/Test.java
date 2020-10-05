package exam.ocpjp.v1.q028;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");
		System.out.println(listVal.stream().filter(x -> x.length()>3).count());
	}

}
