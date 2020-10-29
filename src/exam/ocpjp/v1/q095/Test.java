package exam.ocpjp.v1.q095;

public class Test {
	static boolean isAvailable = false;
	public static boolean doStuff() {
		return !isAvailable;
	}
	public static void main(String[] args) {
		Test ts = new Test();
		System.out.println(isAvailable);
		isAvailable = ts.doStuff();
		System.out.println(isAvailable);
	}

}
