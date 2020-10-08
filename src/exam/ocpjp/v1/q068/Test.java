package exam.ocpjp.v1.q068;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	public void writeFiles() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("data.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("alldata.txt"));
		String line =null;
		while((line = br.readLine()) != null) {
			bw.append(line+"\n");
		}
		//line n1
	}
	public static void main(String[] args) {
//		What is required at line n1 to enable the code to overwrite alldata.txt with data.txt?
//		A. br.close();
//		B. bw.writeln();
//		C. br.flush();
//		D. bw.flush();
//		Answer: D
	}

}
