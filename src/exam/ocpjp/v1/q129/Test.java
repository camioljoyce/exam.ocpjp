package exam.ocpjp.v1.q129;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> content;
		try {
			content = Files.readAllLines(Paths.get("employee.txt"));
			content.stream().forEach(line->{
				try {
					Files.write(Paths.get("allemp.txt"), line.getBytes(), StandardOpenOption.APPEND);
				} catch (IOException e) {
					System.out.println("Exception 1");
				}
			});

		} catch (IOException e) {
			System.out.println("Exception 2");
		}
		
	}

}
