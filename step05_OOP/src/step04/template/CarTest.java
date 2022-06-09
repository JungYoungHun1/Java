package step04.template;

public class CarTest {

	public static void main(String[] args) {
		Car aiCar = new AiCar();
		Car manualCar = new ManualCar();

		aiCar.run();
		System.out.println("----------");
		manualCar.run();
	}

}
