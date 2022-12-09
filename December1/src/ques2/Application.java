package ques2;

public class Application extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread A = new Thread();
		Thread B = new Thread();
		Thread C = new Thread();
		System.out.println("RED LIGHT IS ON");
		A.start();
		try {
			A.sleep(3000);
			System.out.println("RED LIGHT IS OFF");
			System.out.println("GREEN LIGHT IS ON");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		B.start();
		try {
			B.sleep(8000);
			System.out.println("GREEN LIGHT IS OFF");
			System.out.println("YELLOW LIGHT IS ON");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		C.start();
		try {
			C.sleep(10000);
			System.out.println("RED LIGHT IS ON");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}