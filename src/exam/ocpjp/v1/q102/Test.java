package exam.ocpjp.v1.q102;

public class Test {

	public static void main(String[] args) {
		System.out.println("String main "+args[0]);
	}
	public static void main(int[] args) {
		System.out.println("int main "+args[0]);
	}
	public static void main(Object[] args) {
		System.out.println("Object main "+args[0]);
	}
	
//	javac Test.java
//	java Test 1 2 3
	
//	What is the result?
//	A. An exception is thrown at runtime.
//	B. String main 1
//	C. Object main 1
//	D. int main 1
//	E. Compilation fails.
//	Answer: B
}
