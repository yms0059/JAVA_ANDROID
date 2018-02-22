package robot;

import robot.actions.FlyNo;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("SuperRobot이 주문 들어 왔어요. 만들어 주세요.");
		Robot superRobot = new SuperRobot();
		superRobot.shape();
		superRobot.actionBasic();
		superRobot.actionFly();
		superRobot.actionFire();
		superRobot.actionKnife();
		System.out.println("----------------------------------------------");
		
		System.out.println("StandardRobot이 주문 들어 왔어요. 만들어 주세요.");
		Robot standardRobot = new StandardRobot();
		standardRobot.shape();
		standardRobot.actionBasic();
		standardRobot.actionFly();
		standardRobot.actionFire();
		standardRobot.actionKnife();
		System.out.println("----------------------------------------------");
		
		System.out.println("CheapRobot이 주문 들어 왔어요. 만들어 주세요.");
		Robot cheapRobot = new CheapRobot();
		cheapRobot.shape();
		cheapRobot.actionBasic();
		cheapRobot.actionFly();
		cheapRobot.actionFire();
		cheapRobot.actionKnife();
		System.out.println("----------------------------------------------");
	}
	
}
/*
 Robot클래스는 추상클래스이다
 public abstract void shape(); 는 각각 로봇마다 다르기때문에 재정의를 해야한다.
 추상클래스를 상속받는 클래스는 extends Robot을해 상속을 받아온다 대신 하나만 extends할수 있다
 추상클래스에서 생성한것을 사용할 수있다.-> 상속받는 클래스에선 재정의 가능! flyAction = new FlyNo();
 actionFly호출하면->FlyNo가 실행//flyAction.fly();->flyAction = new FlyNo();
 
 FireAction은 인터페이스이다 
 FireNo FireOk는 implments FireAction fly()를 실행하면 생성한거에 맞게 실행해준다.
 */
