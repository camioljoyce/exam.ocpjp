package exam.ocpjp.v1.q025;

class DataConverter implements AutoCloseable{
	public void copyFlatFilesToTables() {
		
	}
	public void close() throws Exception{
		throw new RuntimeException();
	}
}
public class Test {

	public static void main(String[] args) {
		try(DataConverter dc = new DataConverter()){ 
			dc.copyFlatFilesToTables();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//	DataConverter 要implement AutoCloseable 才能寫在try的小括號
}
