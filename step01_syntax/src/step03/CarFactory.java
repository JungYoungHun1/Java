package step03;

import model.domain.Car;

public class CarFactory {

	private static CarFactory instance = new CarFactory();

	private CarFactory() {
	}

	public static CarFactory getInstance() {
		return instance;
	}

	public static Car createCar() {
		Car Carinstance = new Car();
		return Carinstance;
	}

}
