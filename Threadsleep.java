package com.first;

public class Threadsleep extends Thread{

	
	public void run(){
		for(int i=1;i<30;i++){
			System.out.println(i);

			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args) {
		Threadsleep t1 = new Threadsleep();
		Threadsleep t2 = new Threadsleep();
		Threadsleep t3 = new Threadsleep();

		t1.start();
		try {
			t1.join(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}
}
