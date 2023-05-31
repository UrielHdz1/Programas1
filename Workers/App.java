package com.pp2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Workers worker = new Workers();
		Thread t1 = new Thread(worker);
		t1.start();
		
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		
		worker.setTerminated(true);
		System.out.println("Finished...");
	}

}
