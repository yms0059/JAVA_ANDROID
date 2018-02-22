package robot;

import robot.actions.FireOk;
import robot.actions.FlyOk;
import robot.actions.KnifeWithLazer;

public class SuperRobot extends Robot { //Robot클래스에서 추상정의를 한다 extends는 하나만 사용할 수있다.

	public SuperRobot() { //부모에서 선언한것을 자식에서 그대로 사용할 수있다.
		flyAction= new FlyOk(); //그리고 재정의도 가능
		fireAction = new FireOk();
		knifeAction = new KnifeWithLazer();
	}
	
	
	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("기본적으로 팔, 다리, 머리, 몸통으로 이루어져 있습니다. 그리고 걷고, 달릴 수 있습니다.");
	} 

}
