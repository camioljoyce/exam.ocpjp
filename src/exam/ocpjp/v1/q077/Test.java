package exam.ocpjp.v1.q077;
final class IceCream {
	public void prepare() {}
}
class Cake {
	public final void bake(int min, int temp) {}
	public void mix() {}
}
class Shop {
	private Cake c = new Cake ();
	private final double discount = 0.25;
	public void makeReady () { c.bake(10, 120); }
}
class Bread extends Cake {
//	public void bake(int minutes, int temperature) {}
	public void addToppings() {}
}
public class Test {

	public static void main(String[] args) {
//		Which statement is true?
//		A. A compilation error occurs in IceCream.
//		B. A compilation error occurs in Cake.
//		C. A compilation error occurs in Shop.
//		D. A compilation error occurs in Bread
//		E. All classes compile successfully.
//		Answer: D

	}

}
