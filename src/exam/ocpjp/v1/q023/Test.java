package exam.ocpjp.v1.q023;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Vehicle implements Comparable<Vehicle>{
	int vno;
	String name;
	public Vehicle (int vno, String name) {
		this.vno = vno;
		this.name = name;
	}
	public String toString () {
		return vno + ":" + name;
	}
	@Override
	public int compareTo(Vehicle other) {
		return this.vno-other.vno;
	}
}
public class Test {

	public static void main(String[] args) {
		Set<Vehicle> vehicle = new TreeSet<Vehicle>(new Comparator<Vehicle>() {
			@Override
			public int compare(Vehicle o1, Vehicle o2) {
				return o1.vno-o2.vno;
			}
		});
		vehicle.add(new Vehicle(10123, "Ford"));
		vehicle.add(new Vehicle(10124, "BMW"));
		System.out.println(vehicle);
	}
	
//	TreeSet，會將你加入的物件進行排序，預設使用自然順序（Natural order），
//	如果要排序物件，必須要讓class 實作Comparable的compareTo方法
//	或是在宣告TreeSet時，實作Comparator方法

}
