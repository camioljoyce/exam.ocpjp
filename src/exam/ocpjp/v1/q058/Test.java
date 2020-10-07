package exam.ocpjp.v1.q058;

import java.util.concurrent.CyclicBarrier;

class Worker extends Thread {
	 
    CyclicBarrier cb;
 
    public Worker(CyclicBarrier cb) {
        this.cb = cb;
    }
 
    public void run() {
    	
        try {
        	System.out.println("Worker await:");
            cb.await();
            System.out.println("Worker finshed");
        } catch (Exception ex) {
        }
    }
}
 
class Master implements Runnable { //line n1
 
    public void run() {
        System.out.println("Master begin");
        System.out.println("Master finish");
    }
}
public class Test {
	public static void main(String[] args) {
		Master master = new Master();
		CyclicBarrier cb = new CyclicBarrier(2, master);
		Worker worker = new Worker(cb);
		worker.start();
		Worker worker2 = new Worker(cb);
		worker2.start();
	}

}
