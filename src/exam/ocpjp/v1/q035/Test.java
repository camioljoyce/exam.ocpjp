package exam.ocpjp.v1.q035;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> valList = Arrays.asList("","George","","John","Jim");
		Long newVal = valList.stream().filter(x->!x.isEmpty()).count();
		System.out.println(newVal);
	}

}
