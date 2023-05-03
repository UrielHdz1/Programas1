package com.pp2;

public class MultiHola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestTh t1,t2,t3;

        // Creamos los threads
        t1 = new TestTh( "Hilo 1",(int)(Math.random()*2000) );
        t2 = new TestTh( "Hilo 2",(int)(Math.random()*2000) );
        t3 = new TestTh( "Hilo 3",(int)(Math.random()*2000) );

        // Arrancamos los threads
        t1.start();
        t2.start();
        t3.start();
	}

}
