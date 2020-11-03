package exam.ocpjp.v1.q120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product{
	int id;
	int price;
	public Product(int id,int price){
		this.id = id;
		this.price = price;
	}
	public String toString() {
		return id + ":"+price;
	}
}
public class Test {

	public static void main(String[] args) {
		List<Product> products = new ArrayList(Arrays.asList(new Product(1, 10),new Product(2, 30),new Product(2, 30)));
		Product p = products.stream().reduce(new Product(4,0), (p1,p2)->{
			p1.price+=p2.price;
			return new Product(p1.id, p1.price);
		});
		products.add(p);
		System.out.println(products);
		products.stream().parallel().reduce((p1, p2) -> p1.price > p2.price ? p1 : p2).ifPresent(System.out::println);
	} 
}
