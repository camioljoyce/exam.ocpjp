package exam.ocpjp.v1.q054;
class X{
	public void mX() {
		System.out.println("Xm1");
	}
}
class Y extends X{
	public void mX() {
		System.out.println("Xm2");
	}
	public void mY() {
		System.out.println("Ym");
	}
}
public class Test {

	public static void main(String[] args) {
		X xRef = new Y();  //XRef 的實例化是Y
		Y yRef = (Y)xRef;  // Y在向下轉型成Y ，所以實例化還是Y
		yRef.mY();
		xRef.mX();
	}

}
