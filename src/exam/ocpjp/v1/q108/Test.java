package exam.ocpjp.v1.q108;

public class Test {

	public static void main(String[] args) {
		String[] colors = {"red","blue","green","yellow","maroon","cyan"};
		
//		Which code fragment prints blue, cyan, ?
		for(String c:colors) {
			if(c.length()!=4) {
				continue;
			}
			System.out.println(c+",");
		}
	}

}
