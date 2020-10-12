package exam.ocpjp.v1.q080;

import java.io.IOException;

class X{
	public void printFileContent() throws IOException{
		throw new IOException();
	}
}
public class Test {

	public static void main(String[] args) throws IOException {
		X obj = new X();
		obj.printFileContent();
	}

}
