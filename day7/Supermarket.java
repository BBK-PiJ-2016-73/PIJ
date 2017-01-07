
public class Supermarket 
{
	private PersonQueue supQueue; 
	
	public Supermarket()
	{
		this.supQueue = new SuperMarketQueue();
	}
		
    public void addPerson(Person person)
    {
	 supQueue.insert(person);
    }  
	//	
    public Person servePerson()
    {
		Person per = supQueue.retrieve();
		return  per;
    }

}