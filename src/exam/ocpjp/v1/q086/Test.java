package exam.ocpjp.v1.q086;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) {
		int i;
		char c;
		try (FileInputStream fis = new FileInputStream ("C:\\Users\\A7024\\git-sideProject\\exam.ocpjp\\course.txt");
		InputStreamReader isr = new InputStreamReader(fis);) {
			while (isr.ready()) { //line n1
				isr.skip(2);
				i = isr.read ();
				c = (char) i;
				System.out.print(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


