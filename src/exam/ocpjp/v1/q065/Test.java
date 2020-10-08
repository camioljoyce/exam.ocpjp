package exam.ocpjp.v1.q065;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		BufferedReader brCopy = null;
		try (BufferedReader br = new BufferedReader (new FileReader("employee.txt"))) { //line n1
				br.lines().forEach(c -> System.out.println(c));
				brCopy = br;//line n2
		}catch (Exception e) {
			System.out.println(e);
		}
		brCopy.ready(); //line n3;  這裡會出錯，因為try()裡面的物件離開try區塊時會自動closed, 這時在ready,會報錯 
		
		
	}

}
