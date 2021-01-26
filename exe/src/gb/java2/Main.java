package gb.java2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {	
		/*Person p1 = new Person();
		Student s1 = new Student();
		Worker w1 = new Worker();

		Person[] persons = new Person[3];
		persons[0] = p1;
		persons[1] = s1;
		persons[2] = w1;
		
		Sleeping [] studings = persons;
		
		Studing studingStudent = new Student();
		
		
		for(Person p: persons) {
			p.passWeekend();
			if(p instanceof Sleeping) {
				System.out.println("This is student");
			}
		}
		
		p1.move();
		
		System.out.println(Person.nbOfPersons);*/
		Cat c = new Cat();
		Bird b = new Bird();
		Snake s  = new Snake();
		List<Moving> movings = new ArrayList<>();
		movings.add(c);
		movings.add(b);
		movings.add(s);
		
		for(Moving m: movings) {
			m.move();
		}
	}

}
