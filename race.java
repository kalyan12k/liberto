
package demo;
class Car implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("BMW car moving"+i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
		
		}
}
class Bike implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("ninja car is moving");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
			
		}
	}
}
public class Race {
	public static void main(String[] args) {
		Thread ca=new Thread(new Car());
		Thread ba=new Thread(new Bike());
		System.out.println("Gooo");
		ca.start();
		ba.start();
		}
   }
}

