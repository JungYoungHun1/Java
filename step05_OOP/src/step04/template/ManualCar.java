package step04.template;

public class ManualCar extends Car {

	@Override
	void drive() {
		System.out.println("직접 운행 시작");
	}

	@Override
	void stop() {
		System.out.println("직접 운행 종료");
	}

}
