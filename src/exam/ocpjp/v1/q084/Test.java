package exam.ocpjp.v1.q084;

public class Test {
	int x;
	int y;
	public void doStuff(int x,int y) {
		this.x = x;
		y = this.y;
	}
	public void display() {
		System.out.print(x+" "+y+" : ");
	}
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.x = 100;
		t1.y = 200;
		Test t2 = new Test();
		t2.doStuff(t1.x, t1.y);
		t1.display();
		t2.display();
	}

}
