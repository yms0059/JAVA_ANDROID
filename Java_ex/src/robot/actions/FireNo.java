package robot.actions;

public class FireNo implements FireAction{ //FireAction을 implements해서 FireAction이 호출되면 호출된것에 맞게 오버라이드 실행

	@Override //인터페이스할때 항상 필요
	public void fire() {
		System.out.println("미사일 발사 기능 없습니다");
	}
}
