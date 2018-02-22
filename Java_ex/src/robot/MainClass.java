package robot;

import robot.actions.FlyNo;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("SuperRobot�� �ֹ� ��� �Ծ��. ����� �ּ���.");
		Robot superRobot = new SuperRobot();
		superRobot.shape();
		superRobot.actionBasic();
		superRobot.actionFly();
		superRobot.actionFire();
		superRobot.actionKnife();
		System.out.println("----------------------------------------------");
		
		System.out.println("StandardRobot�� �ֹ� ��� �Ծ��. ����� �ּ���.");
		Robot standardRobot = new StandardRobot();
		standardRobot.shape();
		standardRobot.actionBasic();
		standardRobot.actionFly();
		standardRobot.actionFire();
		standardRobot.actionKnife();
		System.out.println("----------------------------------------------");
		
		System.out.println("CheapRobot�� �ֹ� ��� �Ծ��. ����� �ּ���.");
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
 RobotŬ������ �߻�Ŭ�����̴�
 public abstract void shape(); �� ���� �κ����� �ٸ��⶧���� �����Ǹ� �ؾ��Ѵ�.
 �߻�Ŭ������ ��ӹ޴� Ŭ������ extends Robot���� ����� �޾ƿ´� ��� �ϳ��� extends�Ҽ� �ִ�
 �߻�Ŭ�������� �����Ѱ��� ����� ���ִ�.-> ��ӹ޴� Ŭ�������� ������ ����! flyAction = new FlyNo();
 actionFlyȣ���ϸ�->FlyNo�� ����//flyAction.fly();->flyAction = new FlyNo();
 
 FireAction�� �������̽��̴� 
 FireNo FireOk�� implments FireAction fly()�� �����ϸ� �����Ѱſ� �°� �������ش�.
 */
