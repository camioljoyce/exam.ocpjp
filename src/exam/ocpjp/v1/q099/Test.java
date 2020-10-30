package exam.ocpjp.v1.q099;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Test {

	public static void main(String[] args) {
		List<String> qwords = Arrays.asList("why ","what ","when ");
		BinaryOperator<String> operator = (s1,s2) -> s1.concat(s2);
		String sen = qwords.parallelStream().reduce("Word: ", operator);
		System.out.println(sen);
	}

}
