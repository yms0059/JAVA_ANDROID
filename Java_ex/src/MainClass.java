//------------implemenst�� Runnable�� �޴°�------------
/*public class MainClass {
	public static void main(String[] args) {
		ThreadTest threadTest=new ThreadTest();
		Thread thread = new Thread(threadTest,"A");
		thread.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
	}
}*/

//------------extends Thread�� �޴°�------------
/*public class MainClass { //extends Thread�� ��ӹ޴°�
	
	public static void main(String[] args) { 
		
		ThreadTest threadTest = new ThreadTest();
		threadTest.setName("A");
		threadTest.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
	}
}*/


//------------��ü1�� ������n��------------
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

//------------1����ü ������1��
/*public class MainClass {

	public static void main(String[] args) {
		
		ThreadTest threadTest0 = new ThreadTest();
		ThreadTest threadTest1 = new ThreadTest();//���� ������ �Ͽ����� A�ǰ��� ����ؼ� �þ��
		                                          //�ڿ��� ������ �Ͼ���ʴ´�
		
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

