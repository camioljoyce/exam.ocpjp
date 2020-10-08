package exam.ocpjp.v1.q067;
class Foo<K,V>{
	private K key;
	private V value;
	public Foo(K key,V value) {
		this.key = key;
		this.value = value;
	}
	public static <T> Foo<T,T> twice(T value){
		return new Foo<T,T>(value,value);
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}
public class Test {

	public static void main(String[] args) {
//		Which option fails?
//		A. Foo<String, Integer> mark = new Foo<String, Integer> ("Steve", 100);
//		B. Foo<String, String> pair = Foo.<String>twice ("Hello World!");
//		C. Foo<Object, Object> percentage = new Foo<String, Integer>("Steve", 100);
//		D. Foo<String, String> grade = new Foo <> ("John", "A");
//		Answer: C
		
		//選項C要改成下面這樣
		Foo<Object, Object> percentage = new Foo<>("Steve", 100);
	}

}
