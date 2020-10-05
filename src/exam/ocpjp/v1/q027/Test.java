package exam.ocpjp.v1.q027;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Caller implements Callable<String> {
	String str;
	public Caller (String s) {
		this.str=s;
	}
	@Override
	public String call() throws Exception {
		return str.concat (" Caller");
	}
	
}
class Runner implements Runnable {
	String str;
	public Runner (String s) {
		this.str=s;
	}
	@Override
	public void run() {
		System.out.println (str.concat (" Runner"));
	}
	
}
public class Test {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2); //會建立最多可以擁有兩個執行緒的ExecutorService
		Future f1 = es.submit (new Caller ("Call"));
		Future f2 = es.submit (new Runner ("Run"));//runner不會有返回值
		String str1 = (String) f1.get();
		String str2 = (String) f2.get();//line n1 //runner不會有返回值，所以這邊只會有null
		System.out.println(str1+ ":" + str2);
		
//		The program prints:
//		Run Runner
//		Call Caller : null
//		And the program does not terminate.
	}

}
