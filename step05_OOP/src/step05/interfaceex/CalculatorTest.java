package step05.interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		Calc clac2 = new Calculator();

		int x = 10;
		int y = 3;

		System.out.println(calculator.add(x, y));
		System.out.println(calculator.divide(x, 0));
		System.out.println(clac2.add(x, y));
		clac2.turnOn();
		calculator.turnOn();

	}

}
