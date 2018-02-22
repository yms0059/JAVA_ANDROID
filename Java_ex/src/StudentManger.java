import java.util.ArrayList;

public class StudentManger {

	ArrayList<Student> students = new ArrayList<Student>(); // students ArrayList를 생성하고 거기에 Student쿨래스 객체를 집어넣는다
	StudentExpel studentExpel = new StudentExpel();

	public static void main(String[] args) {
		StudentManger studentManger = new StudentManger();
		studentManger.addStudent("홍길동", 22, 20123487, "영극영화");
		studentManger.addStudent("홍길순", 24, 20106428, "수학과");
		studentManger.addStudent("이은경", 21, 20135788, "국문과");
		studentManger.addStudent("김철수", 23, 20114221, "체육과");
		studentManger.addStudent("김순희", 26, 20089883, "무용과");
	}

	private void addStudent(String name, int age, int studentNum, String major) {
		
		students.add(new Student(name,age,studentNum,major));
		System.out.println(name + " 학생 정보 입력 성공!!");
	}
}
