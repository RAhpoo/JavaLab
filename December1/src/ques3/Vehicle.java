package ques3;

public class Vehicle extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread A = new Thread();
		Thread B = new Thread();
		Thread C = new Thread();
		Thread D = new Thread();
		Thread E = new Thread();
		A.start();
		try {
			A.sleep(100);
			System.out.println("CAR A");
			System.out.println("Start the journey");
			A.sleep(200);
			System.out.println("Arrived at toll");
			A.sleep(100);
			System.out.println("Entered the toll booth");
			A.sleep(100);
			System.out.println("Exited the toll booth");
			System.out.println("Cross the Bridge");
			A.sleep(5000);
			System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		B.start();
		try {
			B.sleep(5600);
			System.out.println("CAR B");
			System.out.println("Start the journey");
			B.sleep(5800);
			System.out.println("Arrived at toll");
			B.sleep(5900);
			System.out.println("Entered the toll booth");
			B.sleep(6000);
			System.out.println("Exited the toll booth");
			System.out.println("Cross the Bridge");
			B.sleep(11000);
			System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		C.start();
		try {
			C.sleep(11100);
			System.out.println("CAR C");
			System.out.println("Start the journey");
			C.sleep(11300);
			System.out.println("Arrived at toll");
			C.sleep(11400);
			System.out.println("Entered the toll booth");
			C.sleep(11500);
			System.out.println("Exited the toll booth");
			System.out.println("Cross the Bridge");
			C.sleep(16500);
			System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		D.start();
		try {
			D.sleep(16600);
			System.out.println("CAR D");
			System.out.println("Start the journey");
			D.sleep(16800);
			System.out.println("Arrived at toll");
			D.sleep(16900);
			System.out.println("Entered the toll booth");
			D.sleep(17000);
			System.out.println("Exited the toll booth");
			System.out.println("Cross the Bridge");
			D.sleep(22000);
			System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		E.start();
		try {
			E.sleep(22100);
			System.out.println("CAR E");
			System.out.println("Start the journey");
			E.sleep(22300);
			System.out.println("Arrived at toll");
			E.sleep(22400);
			System.out.println("Entered the toll booth");
			E.sleep(22500);
			System.out.println("Exited the toll booth");
			System.out.println("Cross the Bridge");
			E.sleep(27500);
			System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}