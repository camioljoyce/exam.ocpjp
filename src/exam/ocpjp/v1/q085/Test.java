package exam.ocpjp.v1.q085;

public class Test {
	int ns;
	static int s;
	Test(int ns){
		if(s<ns) {
			s = ns;
			this.ns = ns;
		}
	}
	void doPrint() {
		System.out.println("ns = "+ns+" s = "+s);
	}
	public static void main(String[] args) {
		Test ref1 = new Test(50);
		Test ref2 = new Test(125);
		Test ref3 = new Test(100);
		
		ref1.doPrint();
		ref2.doPrint();
		ref3.doPrint();

	}

}
