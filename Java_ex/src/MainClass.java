//------------implemenst로 Runnable로 받는거------------
/*public class MainClass {
	public static void main(String[] args) {
		ThreadTest threadTest=new ThreadTest();
		Thread thread = new Thread(threadTest,"A");
		thread.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
	}
}*/

//------------extends Thread로 받는거------------
/*public class MainClass { //extends Thread로 상속받는거
	
	public static void main(String[] args) { 
		
		ThreadTest threadTest = new ThreadTest();
		threadTest.setName("A");
		threadTest.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
	}
}*/


//------------객체1개 스레드n개------------
/*public class MainClass {

	public static void main(String[] args) {
		
		ThreadTest threadTest = new ThreadTest();
		
		Thread thread0 = new Thread(threadTest, "A");
		Thread thread1 = new Thread(threadTest, "B");
		thread0.start();
		thread1.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
		
	}
	
}*/

//------------1개객체 스레드1개
/*public class MainClass {

	public static void main(String[] args) {
		
		ThreadTest threadTest0 = new ThreadTest();
		ThreadTest threadTest1 = new ThreadTest();//각자 생성을 하였으니 A의값만 계속해서 늘어난다
		                                          //자원의 공유가 일어나지않는다
		
		Thread thread0 = new Thread(threadTest0, "A");
		Thread thread1 = new Thread(threadTest1, "B");
		thread0.start();
		thread1.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
		
	}
	
}*/

/*public class MainClass {

	public static void main(String[] args) {
		
		VoteThread voteLocation1 = new VoteThread();
		VoteThread voteLocation2 = new VoteThread();
		VoteThread voteLocation3 = new VoteThread();
		
		Thread location1 = new Thread(voteLocation1, "Location1");
		Thread location2 = new Thread(voteLocation2, "Location2");
		Thread location3 = new Thread(voteLocation3, "Location3");
		
		location1.start();
		location2.start();
		location3.start();
	}
}*/
public class MainClass {

	public static void main(String[] args) {
		
		ThreadTest threadTest = new ThreadTest();
		
		Thread thread0 = new Thread(threadTest, "A");
		Thread thread1 = new Thread(threadTest, "B");
		thread0.start();
		thread1.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
		
	}
	
}

