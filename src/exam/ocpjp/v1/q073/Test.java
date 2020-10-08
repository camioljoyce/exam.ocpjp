package exam.ocpjp.v1.q073;

public class Test {

	public static void main(String[] args) {
		String ta ="A ";
		ta = ta.concat("B ");
		String tb = "C ";
		ta = ta.concat(tb);
		ta.replace('C', 'D');
		ta = ta.concat(tb);
		System.out.println(ta);
	}

}
