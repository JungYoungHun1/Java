package abstractEx;

public class ComputerTest {

	public static void main(String[] args) {
		DeskTop deskTop = new DeskTop();
		deskTop.turnOn();
		deskTop.display();
		deskTop.turnOff();

		LapTop lapTop = new LapTop() {

			@Override
			void display() {
				System.out.println("LapTop 출력");

			}
		};

		lapTop.turnOn();
		lapTop.display();
		lapTop.turnOff();
	}

}
