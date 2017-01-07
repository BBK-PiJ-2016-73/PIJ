
public class HospitalManager
{
	private Patient firstPatient;
	private static int  counter;
	
	// this is a member method of class HospitalManager
	// returns true if the patient was found and removed, false otherwise
    // this is a member method of class HospitalManager
	public HospitalManager() {
		this.firstPatient = null;
		this.counter = 0;
	}
	
	public HospitalManager(String name, int age, String illness) {
		this.firstPatient = new Patient(name, age, illness);
	}
	
	public Patient getFirstPatient() {
		return firstPatient;		
	}
	
  
 public void addPatient(Patient newPatient) {
	 
	Patient temp = new Patient(newPatient);
    Patient current = firstPatient;

    if (counter == 0){
        temp.setNextPatient(firstPatient);
        this.firstPatient = temp;
    } else{
        for(int i = 1; i < counter; i++){
            current = current.getNextPatient();
        }
        temp.setNextPatient(current.getNextPatient());
        current.setNextPatient(temp);
    }
    this.counter++;
	
	//Patient tempPatient = new Patient(newPatient);
	/* Patient current = this.firstPatient;
	while (current.getNextPatient() != null)
	{
		// this means we are not yet at the end of the list
		current = current.getNextPatient();
	}
		// at this point, current points to the last patient
		current.setNextPatient(newPatient);
		counter++; */
 }

 public boolean deletePatient(String name) 
 {
	if (firstPatient == null) 
	{
		// list is empty, nothing to remove
		return false;
	}
	if (firstPatient.getName().equals(name))
	{
		// first patient in the list must be removed
		firstPatient = firstPatient.getNextPatient();
		return true;
	}
	
	Patient current = firstPatient;
 
	while (current.getNextPatient() != null) 
	{
		if (current.getNextPatient().getName().equals(name)) 
		{
			// We found it! It is the next one!
			// Now link this patient to the one after the next
			current.setNextPatient(current.getNextPatient().getNextPatient());
			counter--;
			return true;		
		}
		
		current = current.getNextPatient();		
		
 	}
 	return false;
 }
 public void deletPatientMenu()
 {
    //get patient name
	System.out.println("Please enter patient details to delete from the list.");
	System.out.println("Enter first name:");
	String name = System.console().readLine();

	//create a new patient object
	deletePatient(name);

 }
 //prompt user for add option menu
 public void addPatientMenu()
 {
	 //get patient name
	System.out.println("Please enter patient details to add to list.");
	System.out.println("Enter first name:");
	String name = System.console().readLine();
	
	//get patient age
	System.out.println("Please Enter age:");
	int age = Integer.parseInt(System.console().readLine());
	
	//get patient illness details
	System.out.println("Please Enter illness:");
	String illness = System.console().readLine();
	
	//get the instance of the hospital manager class
	HospitalManager hm = new HospitalManager(name, age, illness);
	Patient fPatient =  hm.getFirstPatient();
	
	//create a new patient object
	hm.addPatient(fPatient);
	
	//display details to the user
	System.out.println("\n");
	System.out.println("Name: " + fPatient.getName() + ", Age: " + fPatient.getPatAge() + ", illness :" + fPatient.getPatientIllness() +" has been successfully added.");
	System.out.println("\n");		
		
 }
 private static int getCounter() {
		return counter;
	}
	
	// returns the number of elements in this list.
 public int patientRecordSize() {
		return getCounter();
	}
public void display()
    {
        System.out.println("List items from first to last :");
        Patient current = firstPatient;
        while(current != null)
        {
            current.displayPatient();
            current = current.getNextPatient(); 
        }
        System.out.println("");
    }
}
