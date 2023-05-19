package university;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Student st1= new Student("Sejuti", "Sharmin", 20);
		Student st2= new Student("Mun", "taha", 22);
		Student st3= new Student("Suk", "Rahman", 16);
		
		Employee one= new Employee("Toha", "homie", 20);
		Employee two= new Employee("Muhai", "meen", 21);
		Employee three= new Employee("Protta", "sha", 17);
		
		ArrayList<Person> people= new ArrayList<Person>();
		
		people.add(st1);
		people.add(st2);
		people.add(st3);
		people.add(one);
		people.add(two);
		people.add(three);
		
		University DU= new University(people);
		ArrayList<Person> voters= new ArrayList<Person>();
		voters= DU.getVoters();
		
		for(Person x: voters)
		{
			System.out.println(x.getFullName());
		}
		
		int num= DU.getNumberOfEmployees();
		System.out.println(num);
		
	}

}
