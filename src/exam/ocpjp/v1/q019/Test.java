package exam.ocpjp.v1.q019;

public class Test {
	public double applyDiscount(double price) {
		assert (price>0);
		return price * 0.50;
	}
	public static void main(String[] args) {
		Test t = new Test();
		double newPrice = t.applyDiscount(Double.parseDouble(args[0]));
		System.out.println("New Price : "+newPrice);
	}

}
