
public class SecondClass {
	// TODO Auto-generated constructor stub
	public SecondClass() {
	SingletonClass singletonClass = SingletonClass.getSingletonClass();
	System.out.println("SecondClass");
	System.out.println("i = " + singletonClass.getI());
	
}
}
