package queue;

public class QueueMain {

	public static void main(String[] args) {
		Queue que=new Queue();
		que.size(5);
		for(int i=2;i<7;i++) {
			que.enQueue(i);
		}
		que.iterate();
		for(int i=4;i<7;i++) {
			que.deQueue();
		}
		que.iterate();
		for(int i=7;i<10;i++) {
			que.enQueue(i);
		}
		que.iterate();
	}

	
	
}
