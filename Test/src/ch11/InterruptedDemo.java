package ch11;

public class InterruptedDemo {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void run() {
				try {
					Thread.sleep(3000);
					System.out.println("1111111111111");
				} catch (InterruptedException ex) {
					System.out.println("我醒了XD");
				}
			}
		};
		thread.start();
		//thread.interrupt(); // 主執行緒呼叫thread的interrupt()
	}
}
