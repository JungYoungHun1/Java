package step04.template;

public abstract class Car {

	abstract void drive();

	abstract void stop();

	public void turnOn() {
		System.out.println("turn On");
	}

	public void turnOff() {
		System.out.println("turn Off");
	}

	final public void run() {
		turnOn();
		drive();
		stop();
		turnOff();
	}
}
