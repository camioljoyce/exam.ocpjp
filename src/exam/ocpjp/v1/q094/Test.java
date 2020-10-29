package exam.ocpjp.v1.q094;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		String[] myArray;
		try{
			while(true) {
				myList.add("My String");
			}
		}catch(RuntimeException re) {
			System.out.println("Caught a RuntimeException");
		}catch(Exception e) {
			System.out.println("Caught a Exception");
		}
		System.out.println("Ready to use");

	}

}
