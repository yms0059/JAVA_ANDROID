package robot;

import robot.actions.FireOk;
import robot.actions.FlyNo;
import robot.actions.KnifeWithWood;

public class StandardRobot extends Robot {

	public StandardRobot() {
		// TODO Auto-generated constructor stub
		flyAction = new FlyNo();
		fireAction = new FireOk();
		knifeAction = new KnifeWithWood();
	}
	
	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("�⺻������ ��, �ٸ�, �Ӹ�, �������� �̷���� �ֽ��ϴ�. �׸��� �Ȱ�, �޸� �� �ֽ��ϴ�.");
	}
	

}

