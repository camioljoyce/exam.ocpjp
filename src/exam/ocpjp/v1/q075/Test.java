package exam.ocpjp.v1.q075;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		IntStream str = IntStream.of(1,2,3,4);
		Double d = str.average().getAsDouble();
		
//		DoubleStream str = DoubleStream.of (1.0, 2.0, 3.0, 4.0);
//		Double d = str.average().getAsDouble();
		
//		Stream<Double> str = Stream.of(1.0,2.0,3.0,4.0);
//		Double d = str.mapToDouble(a->a).average().getAsDouble();
		System.out.println("Average : "+d);
	}

}
