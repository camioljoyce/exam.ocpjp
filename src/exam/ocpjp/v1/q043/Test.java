package exam.ocpjp.v1.q043;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> colors = new ArrayList<String>();
		colors.add("green");
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		
		colors.remove(2);
		colors.add(3,"cyan");
		System.out.println(colors);
	}

}
