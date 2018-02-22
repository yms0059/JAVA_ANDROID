import java.util.Random;

/*public class ThreadTest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("ThreadTest");
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}

}*/

/*public class ThreadTest extends Thread {//돌아가는 로직은 똑같다

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("ThreadTest");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}
	
}*/

/*public class ThreadTest implements Runnable {

	int testNum = 0;
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if(Thread.currentThread().getName().equals("A")) {
				System.out.println("====================================");
				testNum++;
			}
			System.out.println("Thread Name : " + Thread.currentThread().getName() + ", testNum : " + testNum);
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}

}*/

/*public class ThreadTest implements Runnable {

	int testNum = 0;
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if(Thread.currentThread().getName().equals("A")) {
				System.out.println("====================================");
				testNum++;
			}
			System.out.println("Thread Name : " + Thread.currentThread().getName() + ", testNum : " + testNum);
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}
	
}*/

/*public class VoteThread implements Runnable {

	int targetNum = 100;
	int sum = 0;
	Random random = new Random();
	
	@Override
	public void run() {
		
		StringBuffer sb = new StringBuffer();
		
		while (true) {
			sum = sum + random.nextInt(10);
			sb.delete(0, sb.toString().length());
			
			if(sum >= targetNum) {
				sum = 100;
				for (int i = 0; i < sum; i++) {
					sb.append('*');
				}
				System.out.println(Thread.currentThread().getName() + " 개표율 : " + sum + "\t: " + sb);
				break;
			} else {
				for (int i = 0; i < sum; i++) {
					sb.append('*');
				}
				System.out.println(Thread.currentThread().getName() + " 개표율 : " + sum + "\t: " + sb);
			}
			try {
				Thread.sleep(200);
			} catch (Exception e) {}
		}
		
	}
}*/

public class ThreadTest implements Runnable {

	int testNum = 0;
	
	@Override
	public synchronized void run() {//싱크로나이즈를 설정해놓으면 스레드가 먼저들어온것이 끝나야 다음것을 진행한다.
		for (int i = 0; i < 10; i++) {
			if(Thread.currentThread().getName().equals("A")) {
				System.out.println("====================================");
				testNum++;
			}
			System.out.println("Thread Name : " + Thread.currentThread().getName() + ", testNum : " + testNum);
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}

}

