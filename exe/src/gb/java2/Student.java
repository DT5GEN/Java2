package gb.java2;

public class Student extends Person implements Studing{
	
	@Override
	public void passWeekend() {
		System.out.println("Do homework");
	}
	
	public void passWeekend(boolean b) {
		
	}
	
	@Override
	public void doHomework() {
		System.out.println("Do homework before session");
	}
	
}
