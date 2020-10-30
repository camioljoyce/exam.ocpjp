package exam.ocpjp.v1.q106;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> prices = Arrays.asList(3,4,5);
		prices.stream()
			.filter(e -> e>4)
			.peek(e -> System.out.println("Price "+e)) 		//line n1
			.map(n -> n-1)									//line n2
			.peek(n -> System.out.println("New Price "+n));	//line n3
	}

}
