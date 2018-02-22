package robot;

import robot.actions.FireOk;
import robot.actions.FlyOk;
import robot.actions.KnifeWithLazer;

public class SuperRobot extends Robot { //RobotŬ�������� �߻����Ǹ� �Ѵ� extends�� �ϳ��� ����� ���ִ�.

	public SuperRobot() { //�θ𿡼� �����Ѱ��� �ڽĿ��� �״�� ����� ���ִ�.
		flyAction= new FlyOk(); //�׸��� �����ǵ� ����
		fireAction = new FireOk();
		knifeAction = new KnifeWithLazer();
	}
	
	
	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("�⺻������ ��, �ٸ�, �Ӹ�, �������� �̷���� �ֽ��ϴ�. �׸��� �Ȱ�, �޸� �� �ֽ��ϴ�.");
	} 

}
