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
		X xRef = new Y();  //XRef ����ҤƬOY
		Y yRef = (Y)xRef;  // Y�b�V�U�૬��Y �A�ҥH��Ҥ��٬OY
		yRef.mY();
		xRef.mX();
	}

}
