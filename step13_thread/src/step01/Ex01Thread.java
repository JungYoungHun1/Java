package step01;

public class Ex01Thread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i + "번 실행");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex01Thread thread = new Ex01Thread();
		thread.start();
		thread.setName("스레드1");

		Ex01Thread thread2 = new Ex01Thread();
		thread2.start();
		thread2.setName("스레드2");

		System.out.println(Thread.currentThread().getName());
	}

}
