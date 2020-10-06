package exam.ocpjp.v1.q039;

class Vehicle{
	String type = "4w";
	int maxSpeed = 100;
	
	Vehicle(String type,int maxSpeed){
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
}
class Car extends Vehicle{
	String trans;
//	Car(String trans){ //Vehicle沒有空建構子  n1
//		this.trans = trans;
//	}
	Car(String type,int maxSpeed, String trans){
		super(type,maxSpeed);
//		this(trans); //不能又super又this n2
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Compilation fails at both line n1 and line n2.
	}

}
