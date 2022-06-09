package abstractEx;

public abstract class Computer {

	abstract void display();

	public void turnOn() {
		System.out.println("Power On");
	}

	public void turnOff() {
		System.out.println("Power Off");
	}
}
