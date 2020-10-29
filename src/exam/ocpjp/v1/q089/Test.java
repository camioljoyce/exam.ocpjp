package exam.ocpjp.v1.q089;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test {
	public static void main(String[] args) {
		Path source = Paths.get("C:\\Users\\A7024\\git-sideProject\\exam.ocpjp\\green.txt");
		Path target = Paths.get("C:\\Users\\A7024\\git-sideProject\\exam.ocpjp\\colors\\yellow.txt");
		try {
			Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
			Files.delete(source);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
