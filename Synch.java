
import java.lang.*;


public class Synch {
	public static void main(String []args) {
		Callme target=new Callme();
		Caller ob1 = new Caller(target, "Hello");
		Caller ob2 = new Caller(target, "Synchronized");
		Caller ob3 = new Caller(target, "World");

		try{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(Exception e) {
			System.out.println("Error"+e.getMessage());
		}

	}
}


class Caller implements Runnable {

	Callme target;
	Thread t;
	String msg;
	Caller(Callme target, String msg) {
		this.msg=msg;
		this.target = target;
		t=new Thread(this);
		t.start();
	}

	public void run() {

		target.call(msg);


		// synchronized(target) {
		// 	target.call(msg);			
		// }
	}
}


class Callme {
	synchronized void call(String msg) {
		try {
			System.out.print("["+msg);
			Thread.sleep(1000);
			System.out.println("]");
		}
		catch(Exception e) {
			System.out.println("Error:" +e.getMessage());
		}
	}
}