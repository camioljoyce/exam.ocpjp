package exam.ocpjp.v1.q036;

public class Test {
	int fvar;
	static int cvar;
	
	@Override
	public String toString() {
		return "Test [fvar=" + fvar + "cvar="+cvar+"]";
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.fvar = 200;
		Test.cvar = 400;
		
		System.out.println(t);
	}

}
