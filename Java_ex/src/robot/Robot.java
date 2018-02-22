package robot;

import robot.actions.FireAction;
import robot.actions.FlyAction;
import robot.actions.KnifeAction;

public abstract class Robot { //Robot클래스를 추상클래스로 만들어 shape클래스는 다시 재정의하게 만든다.

	public FlyAction flyAction;
	public FireAction fireAction;
	public KnifeAction knifeAction;
	
	public Robot() {//생성자를 만들어
		
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
		System.out.println("팔, 다리, 머리, 몸통이 있습니다.");
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
