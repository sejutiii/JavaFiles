package university;

import java.util.ArrayList;
import java.util.Comparator;

public class University {
	
	ArrayList<Person> persons= new ArrayList<Person>();

	public University(ArrayList<Person> persons) {

		this.persons = persons;
	}
	
	 public String getFullNames()
	 {
		String fullnames = null, str= null;
		
		for(Person x:persons)
		{
			str= x.getFullName();
			fullnames.concat(str);
			fullnames.concat(",");
		}
		
		 int i= fullnames.lastIndexOf(',');
		 StringBuffer strB= new StringBuffer(fullnames);
		 strB.deleteCharAt(i);
	     
	     return fullnames;
	 }
	 
	 public Person getoldestPerson()
	 {
		 Person oldest = null;
		 int max=0;
		 for(Person x:persons)
		 {
			 if(x.age > max)
			 {
				 max= x.age;
				 oldest= x;
			 }
		 }
		 return oldest;
	 }
	 
	 public Person getYoungestPerson()
	 {
		 Person youngest= null;
		 int min=100;
		 for(Person x:persons)
		 {
			 if(x.age< min)
			 {
				 min= x.age;
				 youngest= x;
			 }
		 }
		 return youngest;
	 }
	 
	 public ArrayList<Person> getVoters()
	 {
		 ArrayList<Person> voters= new ArrayList<Person>();
		 for(Person x: persons)
		 {
			 if(x.canVote()== true)
			 {
				 voters.add(x);
			 }
		 }
		 return voters;
	 }
	 
	 public int getNumberOfEmployees() 
	 {
		 int numEmployee=0;
		 for(Person x: persons)
		 {
			 String str= x.getFullName();
			 if(str.contains("(Employee)")== true)
			 {
				 numEmployee++;
			 }
		 }
		 
		 return numEmployee;
	 }
}
