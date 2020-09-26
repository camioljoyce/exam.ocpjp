package exam.ocpjp.v1.q010;

public class Test {

    public static void main(String[] args) {
        AnotherSampleClass asc = new AnotherSampleClass();
        SampleClass sc = new SampleClass();
        sc = asc;
        
        System.out.println("sc:"+sc.getClass());
        System.out.println("asc:"+asc.getClass());
    }
}
class SampleClass{
}
class AnotherSampleClass extends SampleClass{
}
