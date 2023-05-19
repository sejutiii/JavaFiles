package university;

public class Person {
	
	protected String firstName;
	protected String lastName;
	protected int age;
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFullName() {
		String fullName= firstName + " "+ lastName ;
		return fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean canVote()
	{
		if(age >= 18)return true;
		else return false;
	}
	
	
}
