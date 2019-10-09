package com.first;

public class NewThread extends Thread{

	public void run(){
		System.out.println("Thrad is running.......");
		System.out.println("current running thread "+Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		NewThread t = new NewThread();
		NewThread t1 = new NewThread();
	
		//System.out.println("Name of 1- thread :"+t.getName());
		//System.out.println("Name of 2- thread :"+t1.getName());
		//t.setName("Priyanka");
		t.start();
		t1.start();
		//System.out.println("Name after modfication :"+t.getName());
	}
}
