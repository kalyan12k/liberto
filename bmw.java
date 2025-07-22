
 package demo;

 abstract class AbstractExample {
    abstract void drive(); 
    abstract void Stop();
}

public class BMW {
	void drive() {
        System.out.println("Driving a BMW");
    }
	void stop() {
		System.out.println("BMW is stop");
	}

    public static void main(String[] args) {
        BMW ob = new BMW();         
        ob.drive();              
        ob.stop();
    }
}

