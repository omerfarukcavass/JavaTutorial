package p9_multi_threading;

import java.util.List;

public class Producer implements Runnable {

	/*
	 * wait: makes this thread wait until get notified
	 * notify: notify any thread waiting for this object.
	 * 
	 * NOTE:
	 * Both these methods are primitive, try not to use them.
	 * Use thread safe collections as explained in next lesson.
	 */

	List<Integer> questionList = null;
	final int LIMIT = 5;
	private int questionNo;

	public Producer(List<Integer> questionList) {
		this.questionList = questionList;
	}

	public void ReadQuestion(int questionNo) throws InterruptedException {

		/*
		 * If we reached max number of questions, Producer thread will wait until it is
		 * notified by consumer thread that there is room for new question.
		 * 
		 */
		synchronized (questionList) {
			while (questionList.size() == LIMIT) {
				System.out.println("Questions are accumulated.Waiting to be answered..");
				questionList.wait();
			}
		}

		/*
		 * If limit is not reached, new questions will be generated. After generating a
		 * question, this thread will notify the consumer thread that I generated new
		 * question if you waiting for a question. (Consumer may not wait for a question, we notify in case it waits)
		 */

		synchronized (questionList) {
			System.out.println("New question: " + questionNo);
			questionList.add(questionNo);
			Thread.sleep(200);
			questionList.notify();
		}

	}

	@Override
	public void run() {

		while (true) {
			try {
				ReadQuestion(questionNo++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
