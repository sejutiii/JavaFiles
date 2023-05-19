package university;

public class Student extends Person {
	
	public Student(String firstName, String lastName, int age)
	{
		super(firstName, lastName, age);
	}

	@Override
	public String getFullName() {
		
		String fullName= super.lastName + "," + super.firstName;
		return fullName;
	}
	
}
