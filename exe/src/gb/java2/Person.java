package gb.java2;

public class Person implements Sleeping, Moving{
	protected int age;
	public static int nbOfPersons;
	
	public Person() {
		++nbOfPersons;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age >= 0) {
			this.age = age;
		}
	}
	
	public void passWeekend() {
		System.out.println("Rest");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
}
