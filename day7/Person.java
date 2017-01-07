public class Person 
{
	private String name;
	private int age;
    private Person nextPerson null;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public Person()
	{
		this.name = null; 
		this.age = 0;
	}
	//returns the Person name
	public String getName()
	{
		return this.name;
	}
	
	//returns the person age
	public int getPersonAge()
	{		
		return this.age;
	}
		
	public Person getNextPerson() 
	{
		return this.nextPerson;
	}
	
	public void setNextPerson(Person newPerson)
	{
		this.nextPerson = newPerson; 
	}
}