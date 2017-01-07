public class SuperMarketQueue implements PersonQueue
{
	private int counter;
	Person personFirst;
	
	public SuperMarketQueue()
	{	
		counter = 0;
	}

	/**
	* Adds another person to the queue.
	*/
	public void insert(Person person)
	{
		Person current = personFirst;
		Person temp = new Person(person.getName(), person.getPersonAge());
	
		
		if (counter == 0){
			temp.setNextPerson(person);
			this.personFirst = temp;
		} else{
	
		current = current.getNextPerson();
			temp.setNextPerson(current.getNextPerson());
			current.setNextPerson(temp);
		}
		this.counter++;
	}
	
	/**
	* Removes a person from the queue.
	*/
	 public Person retrieve()
	 {
		 Person temp = new Person("name", 14);
		 return temp;
	 }
	 
}