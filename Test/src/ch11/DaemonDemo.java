package ch11;

public class DaemonDemo {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void run() {
				while (true) {
					System.out.println("ʨrz");
				}
			}
		};
		Thread thread_new = new Thread() {
			public void run() {
				while (true) {
					System.out.println("Orz");
				}
			}
		};
		thread_new.setPriority(1);
		thread_new.setDaemon(true);
		thread_new.start();
		thread.setPriority(5);
		thread.setDaemon(true);
		thread.start();
	}

}
