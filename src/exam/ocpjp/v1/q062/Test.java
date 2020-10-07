package exam.ocpjp.v1.q062;

final class Folder implements AutoCloseable {// line n1
	@Override
	public void close() throws Exception { //line n2
		System.out.println("Close");
	}
	public void open() {
		System.out.print("Open");
	}
}

public class Test {
	public static void main(String[] args) {
		try (Folder f = new Folder()) {
			f.open();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
