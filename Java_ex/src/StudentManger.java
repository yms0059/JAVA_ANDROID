import java.util.ArrayList;

public class StudentManger {

	ArrayList<Student> students = new ArrayList<Student>(); // students ArrayList�� �����ϰ� �ű⿡ Student�𷡽� ��ü�� ����ִ´�
	StudentExpel studentExpel = new StudentExpel();

	public static void main(String[] args) {
		StudentManger studentManger = new StudentManger();
		studentManger.addStudent("ȫ�浿", 22, 20123487, "���ؿ�ȭ");
		studentManger.addStudent("ȫ���", 24, 20106428, "���а�");
		studentManger.addStudent("������", 21, 20135788, "������");
		studentManger.addStudent("��ö��", 23, 20114221, "ü����");
		studentManger.addStudent("�����", 26, 20089883, "�����");
	}

	private void addStudent(String name, int age, int studentNum, String major) {
		
		students.add(new Student(name,age,studentNum,major));
		System.out.println(name + " �л� ���� �Է� ����!!");
	}
}
