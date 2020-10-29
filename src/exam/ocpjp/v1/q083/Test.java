package exam.ocpjp.v1.q083;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test {
	public void loadResourceBundle() {
		ResourceBundle resource = ResourceBundle.getBundle("Greetings",Locale.US);
		System.out.println(resource.getObject("HELLO_MSG"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test().loadResourceBundle();
	}

}
