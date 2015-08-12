package labwork.lesson11.problems.prob8.a;

public class Main {
	public static void main(String[] args) {
		Queue queue = new Queue();
		multiThreading(queue);
		for (int i = 0; i < 100; i++) {
			System.out.println(queue.remove());
		}
	}

	public static void multiThreading(Queue queue) {
		Runnable runnable = () -> {
			for (int i = 0; i < 1000; ++i) {
				queue.add(i + 1);
			}
		};
		for (int i = 0; i < 100; ++i) {
			new Thread(runnable).start();
		}
	}

}
