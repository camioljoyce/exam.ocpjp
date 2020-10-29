package exam.ocpjp.v1.q088;
interface P {public void method1();}
interface Q extends P {public void method1();}
interface R extends P {public void method2();} //有兩個method
interface S {public default void method() {};} //已經實作了
interface T {public void method1(); public void method2();} //有兩個method
interface U {public void method1(); public abstract void method2();} //有兩個method
public class Test {

	public static void main(String[] args) {
//		Which two interfaces can you use to create lambda expressions? (Choose two.)
//		ANS: PQ
	}

}
