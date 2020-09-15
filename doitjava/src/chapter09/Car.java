package chapter09;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	public void turnOFF() {
		System.out.println("시동을 끕니다");
	}
	
	final public void run() {			//final이 있으면 밑에서 재정의가 불가능
		startCar();
		drive();
		stop();
		turnOFF();
	}
}
