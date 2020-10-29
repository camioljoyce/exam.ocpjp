package exam.ocpjp.v1.q090;

public class Counter extends Thread{
	int i = 10;
	public synchronized void display(Counter obj) {
		try {
			Thread.sleep(5);
			obj.increament(this);
			System.out.println(i);
		}catch(InterruptedException ex) {
			
		}
	}
	public synchronized void increament(Counter obj) {
		i++;
	}
	public static void main(String[] args) {
		final Counter obj1 = new Counter();
		final Counter obj2 = new Counter();
		new Thread(new Runnable() {
			public void run() {
				obj1.display(obj2);
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				obj2.display(obj1);
			}
		}).start();
	}
}
