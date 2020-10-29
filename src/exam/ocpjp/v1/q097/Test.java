package exam.ocpjp.v1.q097;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	String dept,name;
	public Test(String d,String n) {
		dept = d;
		name = n;
	}
	public String toString() {
		return getDept()+":"+getName();
	}
	public String getDept() {
		return dept;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		List<Test> emps = Arrays.asList(new Test("sales","Ada"),new Test("sales","Bob"),new Test("hr","Bob"),new Test("hr","Eva"));
		Stream<Test> s = emps.stream().sorted(Comparator.comparing((Test e) -> e.getDept())
				.thenComparing((Test e)->e.getName()));
		List<Test> eSorted = s.collect(Collectors.toList());
		System.out.println(eSorted);
	}

}
