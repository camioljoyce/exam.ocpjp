package exam.ocpjp.v1.q109;
interface Downloadable{
	public void download();
}
interface Readable extends Downloadable{
	public void readBook();
}
abstract class Book implements Readable{
	public void readBook() {
		System.out.println("Read Book");
	}
}
class Ebook extends Book{
	public void readBook() {
		System.out.println("Read E-Book");
	}

	@Override
	public void download() {
		// TODO Auto-generated method stub
		
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
