package exam.ocpjp.v1.q072;
class Engine{
	double fuelLevel;
	Engine(int fuelLevel){
		this.fuelLevel = fuelLevel;
	}
	public void strat() {
		//line n1
		System.out.println("Started");
	}
	public void stop() {
		System.out.println("Stopped");
	}
}
public class Test {
	public static void main(String[] args) {
//		Your design requires that:
//		- fuelLevel of Engine must be greater than zero when the start() method is invoked.
//		- The code must terminate if fuelLevel of Engine is less than or equal to zero.
//		Which code fragment should be added at line n1 to express this invariant condition?
//		A. assert (fuelLevel) : "Terminating...";
//		B. assert (fuelLevel > 0) : System.out.println ("Impossible fuel");
//		C. assert fuelLevel < 0: System.exit(0);
//		D. assert fuelLevel > 0: "Impossible fuel" ;
//		Answer: C
		
//		- assert <boolean表示式>
//		如果<boolean表示式>為true，則程式繼續執行。
//		如果為false，則程式丟擲AssertionError，並終止執行。
//
//		- assert <boolean表示式> : <錯誤資訊表示式>
//		如果<boolean表示式>為true，則程式繼續執行。
//		如果為false，則程式丟擲java.lang.AssertionError，並輸入<錯誤資訊表示式>。
		
		
	}

}
