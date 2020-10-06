package exam.ocpjp.v1.q053.clothing.pants;

import static exam.ocpjp.v1.q053.clothing.Shirt.getColor; //import ÀRºA¦¨­û

public class Jeans {
	public void matchShirt() {
		String color = getColor();
		if(color.equals("Green")) {
			System.out.println("Fit");
		}
	}
	public static void main(String[] args) {
		Jeans trouser = new Jeans();
		trouser.matchShirt();
	}
}
