package exam.ocpjp.v1.q044;
class Student{
	String names;
	int age;
}
public class Test {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s1 = s3;
		s3 = s2;
		s2 =null; //s2變成空指針，要被回收了
//		Which statement is true?
//		A. After line 14, one object is eligible for garbage collection.
//		B. After line 14, two object are eligible for garbage collection.
//		C. After line 14, none of the objects are eligible for garbage collection.
//		D. After line 14, three objects are eligible for garbage collection.
//		Answer: A
	}

}
