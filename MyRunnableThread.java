package com.first;

public class MyRunnableThread implements Runnable{

	@Override
	public void run() {
		System.out.println("thread is running ");
	}

	public static void main(String[] args) {
		MyRunnableThread mt = new MyRunnableThread();
		Thread t= new Thread(mt);
	
		t.start();
		}
}
