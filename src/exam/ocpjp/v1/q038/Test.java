package exam.ocpjp.v1.q038;
class Caller{
	private void init() { //private的方法無法呼叫到
		System.out.println("init");
	}
	public void start() {
		System.out.println("start");
	}
}
public class Test {

	public static void main(String[] args) {
		Caller c = new Caller();
		c.start();
//		c.init(); 
	}

}
