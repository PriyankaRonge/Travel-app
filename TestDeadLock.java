package com.first;

public class TestDeadLock {
public static void main(String[] args) {
	final String res1="priyanka";
	final String res2 ="nitin";
	
	Thread t1 = new Thread(){
		public void run(){
			synchronized (res1){
				System.out.println("Thread 1- locked resource 1");
			try{
				Thread.sleep(700);
			}
			catch(Exception  e){
				
			}
				synchronized(res2){
					System.out.println("Thread 1- locked resource 2");
				}
			}
		}
	};
	
	Thread t2 = new Thread(){
		public void run(){
			synchronized (res1){
				 System.out.println("Thread 2- locked resource 2");
				 try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(res2){
					System.out.println("Thread 2 - locked resource 1");
				}
			}
		}
	};
		
	t1.start();
	t2.start();
}
}
