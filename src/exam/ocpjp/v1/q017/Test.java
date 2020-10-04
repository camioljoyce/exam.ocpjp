package exam.ocpjp.v1.q017;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {

	public static void main(String[] args) {
		Deque<String> queue = new ArrayDeque<String>();
		queue.add("Susan");
		queue.add("Allen");
		queue.add("David");
		
		System.out.println(queue);
		System.out.println(queue.pop());
		System.out.println(queue.remove());
		System.out.println(queue);
	}

}
