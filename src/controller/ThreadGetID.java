package controller;

public class ThreadGetID extends Thread {

	public ThreadGetID() {
		super();
	}
	
	@Override
	public void run() {
		getThreadID();

	}
	
	private void getThreadID() {
		int tid = (int) getId();
		System.out.println("#"+tid);
		
	}
}
