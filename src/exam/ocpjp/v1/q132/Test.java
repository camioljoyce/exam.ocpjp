package exam.ocpjp.v1.q132;

public class Test {
	public static void doStuff() throws ArithmeticException, NumberFormatException,Exception {
		if(Math.random() >-1) 
			throw new Exception ("Try again");
	}
	public static void main(String[] args) {
		try {
			doStuff();
		} catch (ArithmeticException | NumberFormatException e){
			System.out.println (e.getMessage()); 
		}catch (Exception e) {
			System.out.println (e.getMessage()); 
		}
	}
}
