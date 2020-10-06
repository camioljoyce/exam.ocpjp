package exam.ocpjp.v1.q032;

interface Doable {
	public void doSomething (String s);
}
public class Test {
	
	public static void main(String[] args) {
			
//			Which two class definitions compile?
//			A. public abstract class Task implements Doable { 
//				public void doSomethingElse(String s) { }
//			}
//			B. public abstract class Work implements Doable { 
//				public abstract void doSomething(String s) { }
//				public void doYourThing(Boolean b) { }
//			}
//			C. public class Job implements Doable {
//				public void doSomething(Integer i) { }
//			}
//			D. public class Action implements Doable {
//				public void doSomething(Integer i) { }
//				public String doThis(Integer j) { }
//			}
//			E. public class Do implements Doable {
//				public void doSomething(Integer i) { }
//				public void doSomething(String s) { }
//				public void doThat (String s) { }
//			}
//		#### A. doSomethingElse與doSomething不同方法，但是本身是abstract class,所以可以有未實作的方法
//		#### B. 抽象方法不能有實作區塊
//		#### C. doSomething(Integer i)和doSomething (String s)是不同方法，不是抽象類別的話必須要實作Doable的doSomething (String s)
//		#### D. 跟C.原因一樣
//		#### E. 有實作Doable的doSomething(String s)
//		System.out.println("AE");
	}

}
