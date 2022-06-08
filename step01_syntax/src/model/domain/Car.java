package model.domain;

public class Car {
	private int carNum;
	private static int serialNum = 343;

	// 생성자
	public Car() {
		// TODO Auto-generated constructor stub
	}

	// getter setter

	public int getCarNum() {
		return carNum = ++serialNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

	public int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

}
