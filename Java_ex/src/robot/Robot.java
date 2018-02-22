package robot;

import robot.actions.FireAction;
import robot.actions.FlyAction;
import robot.actions.KnifeAction;

public abstract class Robot { //RobotŬ������ �߻�Ŭ������ ����� shapeŬ������ �ٽ� �������ϰ� �����.

	public FlyAction flyAction;
	public FireAction fireAction;
	public KnifeAction knifeAction;
	
	public Robot() {//�����ڸ� �����
		
	}
	
	public abstract void shape();
	
	public void actionFly() {
		flyAction.fly();
	}
	public void actionFire() {
		fireAction.fire();
	}
	
	public void actionKnife() {
		knifeAction.knife();
	}
	public void actionBasic() {
		// TODO Auto-generated method stub
		System.out.println("��, �ٸ�, �Ӹ�, ������ �ֽ��ϴ�.");
	}

	public void setFlyAction(FlyAction flyAction) {
		this.flyAction = flyAction;
	}

	public void setFireAction(FireAction fireAction) {
		this.fireAction = fireAction;
	}

	public void setKnifeAction(KnifeAction knifeAction) {
		this.knifeAction = knifeAction;
	}
	
}
