package exam.ocpjp.v1.q128;

class Book{
	private String read(String bname) { return "Read" + bname; }
}

class EBook extends Book {
	public String read(String url) { return "View" + url; }
}
public class Test {

	public static void main(String[] args) {
//		Book b1 = new Book();
//		b1.read("Java Programing");
//		Book b2 = new EBook();
//		b2.read("http://ebook.com/ebook");

	}

}
