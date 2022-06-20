package step01;

// Runnable 인터페이스를 통한 Thread 객체 생성
public class Ex02Runnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i + "번 실행");
		}
	}

	public static void main(String[] args) {
		Runnable runnable = new Ex02Runnable();
		Thread thread = new Thread(runnable);
//		thread.start();

		Runnable runnable2 = new Ex02Runnable();
		Thread thread2 = new Thread(runnable2);
//		thread2.start();

		// 순위(Priority) 할당 : 기본값은 5 (1~10)
		thread.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);

		thread.start();
		thread2.start();
	}

}
