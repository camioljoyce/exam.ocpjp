package exam.ocpjp.v1.q046;

public class Test {
	String name;
	boolean contract;
	double salary;
	Test(){
		this.name = new String("Joe");
		this.contract = new Boolean("true");
		this.salary = new Double(100);
	}
	
	@Override
	public String toString() {
		return "Test [name=" + name + ", contract=" + contract + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.name = "Joe";
		t.contract = true;
		t.salary = 100;
		System.out.println(t);
	}
	
//	Which two modifications, when made independently, enable the code to print Joe:true:100.0?

}
