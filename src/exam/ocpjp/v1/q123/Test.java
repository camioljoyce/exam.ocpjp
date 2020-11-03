package exam.ocpjp.v1.q123;

import java.io.Console;

public class Test {

	public static void main(String[] args) {
		Console console = System.console();
		char[] pass = console.readPassword("Enter password:");
		String password = new String(pass);
	}

}
