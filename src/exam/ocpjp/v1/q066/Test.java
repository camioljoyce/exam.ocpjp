package exam.ocpjp.v1.q066;

public class Test {

	public static void main(String[] args) {
		String product = "Pen";
		product.toLowerCase();
		product.concat(" Box".toLowerCase());
		System.out.println(product.substring(4,6)); 
		//因為toLowerCase和concat都沒有設回給原本的字串，所以product字串並沒有被改變，所以當substring(4,6)時會出錯

	}

}
